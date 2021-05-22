package D03_核心类库_04_IO.zy.express;



        import java.io.*;
        import java.util.HashSet;

public class Util1 {
    //将文件中的快递信息转到内存中
    public void serial(HashSet<Express> hashSet,String fileName){
        ObjectOutputStream f = null;
        try{
            f = new ObjectOutputStream(new FileOutputStream(fileName));
            f.writeObject(hashSet);
            System.out.println("保存成功！");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (f!=null){
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //将数据存储到文件中
    public HashSet<Express> serial2(String fileName) {
        File f5 = new File(fileName);
        HashSet<Express> hashSet = new HashSet<>();
        if (f5.length()!=0){
            ObjectInputStream f = null;

            try {
                f = new ObjectInputStream(new FileInputStream(fileName));
                Object o = f.readObject();
                hashSet = (HashSet) o;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (f != null) {
                    try {
                        f.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return hashSet;
            }
        }
        return hashSet;
    }
}

