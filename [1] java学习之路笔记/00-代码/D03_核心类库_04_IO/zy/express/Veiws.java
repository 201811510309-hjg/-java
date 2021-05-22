package D03_核心类库_04_IO.zy.express;



        import java.util.Scanner;

public class Veiws {
    //快递信息
    private Scanner input = new Scanner(System.in);
    public int isNo(){
        System.out.println("请根据下列提示，选择功能序号：");
        System.out.println("1.将以前存过的数据，读取出来，并使用！");
        System.out.println("2.进行重新存储！");
        String s = input.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){

        }
        if (num<1 || num>2){
            System.out.println("您输入有误，请重新输入！");
            return isNo();
        }
        return num;
    }
    //欢迎界面
    public void welcome(){
        System.out.println("欢迎来到东信国际快递业务中心！");
    }
    //退出界面
    public void exit(){
        System.out.println("欢迎下次使用！");
    }
    //快递柜主菜单
    public int menu(){
        System.out.println("请根据提示，选择功能序号：");
        System.out.println("1.快递员");
        System.out.println("2.用户");
        System.out.println("0.退出");
        int num = -1;
        String s = input.nextLine();
        try{
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){  //为什么需要写这个try、catch

        }
        if (num<0 || num>2){
            System.out.println("您的输入有误，请重新输入！");
            return menu();
        }
        return num;
    }
    //快递员的菜单
    public int cmenu(){
        System.out.println("请根据提示，选择功能序号！");
        System.out.println("1.快递录入");
        System.out.println("2.快递修改");
        System.out.println("3.快递删除");
        System.out.println("4.查看所有");
        System.out.println("0.返回主菜单");
        int num = -1;
        String s = input.nextLine();
        try{
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){

        }
        if (num<0 || num>4){
            return cmenu();
        }
        return num;
    }
    //快递员的录入功能
    public Express insert(){
        System.out.println("请根据提示，进行操作！");
        System.out.println("请输入快递单号：");
        String number = input.nextLine();
        System.out.println("请输入快递公司：");
        String company = input.nextLine();
        // 不能返回两个数据，那我要怎么样才能将这些数据添加到对象中
        //可以创建一个快递对象，将这些添加进去，并返回对象，进行添加取件码
        Express e = new Express();
        e.setNumber(number);
        e.setCompany(company);
        return e;
    }
    //快递员的修改功能,先要将快递单号输入，然后进行查找，最后进行修改 分为三个方法
    //输入快递单号功能
    public String inputNumber(){
        System.out.println("请输入要查找的快递单号：");
        String s = input.nextLine();
        return s;
    }

    //进行快递删除
    public int delete(){
        System.out.println("是否要删除此快递？");
        System.out.println("1.删除此快递");
        System.out.println("2.暂且不删除");
        String s = input.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){

        }
        if (num<1 || num>2){
            System.out.println("您输入有误，请重新输入：");
            return delete();
        }
        return num;
    }

    //进行修改
    public Express midificate(Express e){
        System.out.println("请输入新的快递单号：");
        String s = input.nextLine();
        e.setNumber(s);
        System.out.println("请输入新的快递公司：");
        String s1 = input.nextLine();
        e.setCompany(s1);
        //置为0
        return e;
    }


    //用户菜单
    public int pickup(){
        System.out.println("请输入您的快递取件码：");
        String s = input.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){

        }
        if(num<100000 || num>999999){
            System.out.println("您的输入有误，请重新输入");
            return pickup();
        }
        return num;
    }
}

