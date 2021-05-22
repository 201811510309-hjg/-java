package D03_核心类库_04_IO.zy.express;



        import java.util.HashSet;
        import java.util.Iterator;
        import java.util.Objects;
        import java.util.Random;

public class MyList {
    public void setHashSet(HashSet<Express> hashSet) {
        this.hashSet = hashSet;
    }

    private HashSet<Express> hashSet =  new HashSet<>(100);;
    private Random random = new Random() ;

    public MyList(){ //初始容量为100
    }

    public MyList(HashSet<Express> e) {
        this();
        this.hashSet= e;
    }

    public HashSet<Express> getHashSet() {
        return hashSet;    //取得集合
    }
    //生成取件码的操作
    public boolean code(Express e1){
        //先判断集合是否已满
        if(hashSet.size()>100){ //有一个疑问，我删除快递的时候，将code值为零,在集合中还是有数据的
            System.out.println("快递柜已满，不能进行存储");
            return false;
        }
        int r = 0;
        while (true){
            r = random.nextInt(900000)+100000;
            //这里面得有一个判断是否重复的操作
            boolean b = judgeCode(r);
            if (b==false){
                e1.setCode(r);
                return true;
            }
        }
    }
    //判断取件码是否重复
    public boolean judgeCode(int r){
        //得遍历集合中对象的code
        Iterator<Express> i = hashSet.iterator();
        while (i.hasNext()){
            Express o = i.next();
            if (o.getCode()==r){
                return true;
            }
        }
        return false;
    }
    //查找快递单号 ，找到所在的快递对象，并且返回这个对象
    public Express findNumber(String s){
        //这个得遍历集合了
        Iterator<Express> i = hashSet.iterator();
        while (i.hasNext()){
            Express o = i.next();
            if (Objects.equals(o.getNumber(),s)){
                return o;
            }
        }
        return null;
    }
    //删除快递
    public void delete(Express e){
        //集合中迭代查找这个对象
        Iterator<Express> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            if (e==iterator.next()){
                iterator.remove();
            }
        }
    }
    //查看所有快递
    public void printAll(){
        System.out.println("快递信息如下:");
        Iterator<Express> i = hashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
    //用户取件的时候根据取件码，进行取件
    public Express getCode(int code){
        //遍历快递
        Iterator<Express> i = hashSet.iterator();
        while (i.hasNext()){
            Express express = i.next();
            if (express.getCode()==code){
                System.out.println("找到这个快递了!");
                return express;
            }
        }
        return null;
    }

}

