package D03_核心类库_03集合.zy.快递2;

import java.util.Scanner;

public class View1 { //快递菜单
    private Scanner sc = new Scanner(System.in);
    private ExpressOp expressOp = new ExpressOp();

    //首页
    //欢迎
    public void welcome(){
        System.out.println("*******欢迎使用快递系统*******");
    }

    //结束
    public void bye(){
        System.out.println("期待下次使用，再见");
    }
    // 选择用户界面
    public int menu(){
        System.out.println("********请选择用户类型*******：");
        System.out.println("1：快递员    2：用户     0:退出");
        System.out.println("******************************");
        String text = sc.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(text);
        }catch(NumberFormatException e){

        }
        if(num < 0 || num > 2){
            return menu();
        }
        return num;
    }

    //快递员界面
    public int cMenu(){
        System.out.println("请选择所要进行的操作：");
        System.out.println("1：存入快递");
        System.out.println("2：删除快递");
        System.out.println("3：修改快递");
        System.out.println("4：查看快递");
        System.out.println("0：返回上层");
        System.out.println("********************");
        String text = sc.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(text);
        }catch(NumberFormatException e){

        }
        if(num < 0 || num > 4){
            System.out.println("输入有误，请重新输入");
            return cMenu();
        }
        return num;
    }

    // 用户取件界面
    public int uMenu(){
        System.out.println("请根据提示完成操作：");
        System.out.println("请输入取件码：");
        String code = sc.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(code);
        }catch(NumberFormatException e){

        }
        if(num < 100000 || num > 999999){
            System.out.println("输入有误");
            return uMenu();
        }
        return num;
    }
}

