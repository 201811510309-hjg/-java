package D03_核心类库_04_IO.zy.express;

import java.util.HashSet;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    private static MyList myList = new MyList();
    private static Veiws veiws = new Veiws();

    public static void main(String[] args) {


        //System.out.println("请输入文件名称"); //随便输入一个文件的绝对路径,最后自动生成文件
        //String fileName = sc.nextLine();
        String fileName = "\\express\\1.txt";

        HashSet<Express> hash = saveFile1(fileName);
        myList.setHashSet(hash);

        //先导入欢迎界面
        veiws.welcome();
        //开始进入主菜单
        boolean flag = true;
        while (flag) {
            int num = veiws.menu();
            //进入switch里面
            switch (num) {
                case 1:  //快递员的操作
                    express();
                    break;
                case 2:   //用户的操作
                    user();
                    break;
                case 0:   //退出循环
                    flag = false;
                    saveFile(myList.getHashSet(), fileName);
                    veiws.exit();
                    break;
            }
        }
    }

    public static  void express(){
        boolean flag = true;
        while (flag){
            int num = veiws.cmenu();
            switch (num){
                case 1:  //快递员进行添加操作
                    Express e = veiws.insert(); //已经添加快递单号，与快递公司了
                    myList.code(e); //将生成出来的取件码，再赋给对象e
                    myList.getHashSet().add(e); //将e添加到集合中
                    System.out.println("添加成功！");
                    System.out.println(e);
                    break;
                case 2: //快递员进行修改操作
                    String s = veiws.inputNumber(); //填写就的快递单号
                    Express e1 = myList.findNumber(s); //进行查找，找到这个对象
                    //判断e1是否为null
                    if(e1==null){
                        System.out.println("没找到这个快递！");
                    }else{//快递不为空
                        System.out.println("找到这个快递了！");
                        veiws.midificate(e1);
                        myList.code(e1);
                        System.out.println("修改成功！");
                    }
                    break;
                case 3://删除此快递
                    String s1 = veiws.inputNumber(); //填写就的快递单号
                    Express e2 = myList.findNumber(s1); //进行查找，找到这个对象
                    //判断e1是否为null
                    if(e2==null){
                        System.out.println("没找到这个快递！");
                    }else{//快递不为空
                        System.out.println("找到这个快递了！");
                        int d = veiws.delete();
                        if (d==1){
                            myList.delete(e2);
                            System.out.println("删除成功！");
                        }
                    }
                    break;
                case 4://输出快递柜里面的所有快递
                    myList.printAll();
                    break;
                case 0:
                    flag = false;  //返回主菜单
                    break;
            }
        }
    }
    public static void user(){
        int code = veiws.pickup();
        Express e2 = myList.getCode(code);
        if (e2==null){
            System.out.println("没找到这个快递！");
        }else{
            myList.delete(e2);
            System.out.println("取件成功！");
        }
    }
    //将存储快递信息的集合，存到文件中
    public static  void saveFile(HashSet<Express> hashSet,String fileName){

        Util1 u = new Util1();
        u.serial(hashSet,fileName);
    }
    //将文件中的数据提取到内存集合中
    public static HashSet<Express> saveFile1(String fileName){
        Util1 u = new Util1();
        HashSet<Express> hashSet = u.serial2(fileName);
        return hashSet;
    }
}

