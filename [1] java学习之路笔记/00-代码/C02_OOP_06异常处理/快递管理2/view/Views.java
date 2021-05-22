package C02_OOP_06异常处理.快递管理2.view;

import C02_OOP_06异常处理.快递管理2.bean.Express;

import java.util.Scanner;

public class Views {
    private Scanner input = new Scanner(System.in);

    /**
     * 欢迎
     */
    public void welcome(){
        System.out.println("欢迎使用虫子快递管理系统");
    }

    /**
     * 再见
     */
    public void bye(){
        System.out.println("欢迎下次使用");
    }
    /**
     * 选择身份的菜单
     * @return
     */
    public int menu(){
        System.out.println("请根据提示,输入功能序号:");
        System.out.println("1.快递员");
        System.out.println("2.普通用户");
        System.out.println("0.退出");
        //这里的代码逻辑相较于.nextInt的优点在哪?
        //单思考这个方法内的逻辑，没有优点;
        //但是思考全局代码是有优点.所有方法均使用nextLine,不会因为输入产生冲突,还可以更好地接收各种类型的数据.
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        }catch(NumberFormatException e){
        }
        if(num<0||num>2){
            System.out.println("输入有误,请重新输入");
            return menu();
        }
        return num;
    }

    /**
     * 快递员菜单
     * @return
     */
    public int cMenu(){
        System.out.println("请根据提示,输入功能序号:");
        System.out.println("1.快递录入");
        System.out.println("2.快递删除");
        System.out.println("3.快递修改");
        System.out.println("4.查看所有快递");
        System.out.println("0.返回菜单");
        //这里的代码逻辑相较于.nextInt的优点在哪?
        //单思考这个方法内的逻辑，没有优点;
        //但是思考全局代码是有优点.所有方法均使用nextLine,不会因为输入产生冲突,还可以更好地接收各种类型的数据.
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        }catch(NumberFormatException e){
        }
        if(num<0||num>4){
            System.out.println("输入有误,请重新输入");
            return cMenu();
        }
        return num;
    }

    /**
     * 快递员录入快递
     * @return包含了快递单号和快递公司的快递对象
     */
    public Express insert(){
        System.out.println("请根据提示,输入快递信息:");
        System.out.println("请输入快递单号:");
        String number = input.nextLine();
        System.out.println("请输入快递公司:");
        String company = input.nextLine();
        Express e = new Express();
        e.setCompany(company);
        e.setNumber(number);
        return e;
    }

    /**
     * 提示用户输入快递单号
     * @return
     */
    public String findByNumber(){
        System.out.println("请根据提示,输入快递信息:");
        System.out.println("请输入要操作的快递单号:");
        String number = input.nextLine();
        return number;
    }

    /**
     * 打印显示快递信息
     * @param e
     */
    public void printExpress(Express e){
        System.out.println("快递信息如下:");
        System.out.println("快递公司:"+e.getCompany()+",快递单号:"+e.getNumber()+",取件码:"+e.getCode());
    }
    public void printNull(){
        System.out.println("快递不存在，请检查您的输入！");
    }

    /**
     * 询问是否删除快递,1.表示删除. 2.表示取消.
     * @return
     */
    public int delete(){
        System.out.println("是否确认删除?");
        System.out.println("1.确认删除");
        System.out.println("2.取消操作");
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        }catch(NumberFormatException e){
        }
        if(num<1||num>2){
            System.out.println("输入有误,请重新输入");
            return delete();
        }
        return num;
    }
    /**
     * 修改快递信息
     * @param e
     */
    public void update(Express e){
        System.out.println("请输入新的快递单号:");
        String number = input.nextLine();
        System.out.println("请输入新的快递公司:");
        String company = input.nextLine();
        e.setNumber(number);
        e.setCompany(company);
    }

    /**
     * 查看所有快递
     * @param es
     */
    public void printAll(Express[][] es){
        int count = 0;
   for(int i=0;i<10;i++){
       for(int j=0;j<10;j++){
           if(es[i][j] != null){
               count++;
               System.out.print("第"+(i+1)+"排"+(j+1)+"列快递,");
               printExpress(es[i][j]);
           }
       }
   }
   if(count == 0){
       System.out.println("暂无快递信息");
   }
}

    /**
     * 用户菜单
     * @return
     */
    public int uMenu(){
        System.out.println("请根据提示,进行取件:");
        System.out.println("请输入您的取件码");
        String code = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(code);
        }catch(NumberFormatException e){
        }
        if(num<100000||num>999999){
            System.out.println("输入有误,请重新输入");
            return uMenu();
        }
        return num;

    }
    public void espressExist(){
        System.out.println("此单号在快递柜中已经存在，请勿重复存储。");
    }
    //public void printCode(Express e){
    //    System.out.println("快件的取件码为"+e.getCode());
   // }
    public void success(){
        System.out.println("操作成功");
    }
}
