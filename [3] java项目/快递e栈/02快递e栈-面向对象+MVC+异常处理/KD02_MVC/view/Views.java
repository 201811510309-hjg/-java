package KD02_MVC.view;

import KD02_MVC.bean.Express;

import java.util.Scanner;

public class Views {
    private Scanner input = new Scanner(System.in);
    /**
     * 退出再见
     */
    public void bye(){
        System.out.println("欢迎下次使用！");
    }
    /**
     * 欢迎
     */
    public void welcome(){
        System.out.println("欢迎使用xxxx快递管理");
    }
    /**
     * 选择身份菜单
     */
    public int menu(){
        System.out.println("请根据提示，选择功能序号");
        System.out.println("1. 快递员");  //快递员-身份认证 密码
        System.out.println("2. 用户");
        System.out.println("0. 退出");
        //这里的代码逻辑相较于.nextInt有点在哪？
        //单思考这个方法内的逻辑没有什么优点
        //但是考虑全局代码，所有方法均使用nextLine，不会因为输入产生冲突，还可以更好的接收各种类型的数据
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text); //parseInt 将字符串参数解析为带符号的十进制整数。
        }catch (NumberFormatException e){

        }
        if (num>2 || num<0){
            System.out.println("输入有误，请重新输入");
            return menu();
        }
        return num;
    }

    /**
     * 快递员菜单
     */
    public int cMenu(){
        System.out.println("请根据提示，选择功能序号");
        System.out.println("1. 快递录入");
        System.out.println("2. 快递修改");
        System.out.println("3. 快递删除");
        System.out.println("4. 查看所有快递");
        System.out.println("0. 返回上一级/退出");
        //这里的代码逻辑相较于.nextInt有点在哪？
        //单思考这个方法内的逻辑没有什么优点
        //但是考虑全局代码，所有方法均使用nextLine，不会因为输入产生冲突，还可以更好的接收各种类型的数据
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        }catch (NumberFormatException e){

        }
        if (num>4 || num<0){
            System.out.println("输入有误，重新输入");
            return cMenu();
        }
        return num;
    }
    /**
     * 快递员录入快递  insert 插入
     * @return  包含了快递单号和快递公司
     */
    public Express insert(){
        System.out.println("请根据提示，输入快递信息：");
        System.out.println("请输入快递单号");
        String number = input.nextLine();
        System.out.println("请输入快递公司");
        String company = input.nextLine();
        Express e = new Express();
        e.setNumber(number);
        e.setConpany(company);
        return e;
    }

    /**
     * 提示用户输入快递单号
     * @return
     */
    public String findByNumber(){
        System.out.println("请根据提示，输入快递信息");
        System.out.println("请输入要操作的快递单号");
        String number = input.nextLine();
        return number;
    }

    /**
     * 打印快递信息
     * @param e
     */
    public void printExpress(Express e){
        System.out.println("快递信息如下");
        System.out.println("快递单号："+e.getNumber()+",快递公司:"+e.getConpany()+"，取件码"+e.getCode());
    }

    public void printNull(){
        System.out.println("该快递不存在，请检查您的输入");
    }
    /**
     * 修改快递
     * @param e
     */
    public void update(Express e){
        System.out.println("请输入新的快递单号");
        String newNumber = input.nextLine();
        System.out.println("请输入新的快递公司");
        String newCompany = input.nextLine();
        e.setNumber(newNumber);
        e.setConpany(newCompany);
    }
    /**
     * 删除快递
     * @return 1代表确认删除，2代表取消
     */
    public int delete() {
        int result;
        System.out.println("是否确认要删除？");
        System.out.println("1.确认删除");
        System.out.println("2.取消删除");
        System.out.println("0.退出");
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {

        }
        if (num > 2 || num < 0) {
            System.out.println("输入有误，请重新输入");
            result = delete();
        } else {
            result = num;
        }
        return result;
    }

    /**
     * 查看所有快递
     * @param es
     */
    public void printAll(Express[][] es){
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (es[i][j] != null){
                    count++;
                    System.out.print("第"+(i+1)+"排 "+"第"+(j+1)+"列");
                    printExpress(es[i][j]);
                }
            }
        }
        if (count == 0){
            System.out.println("暂无快递信息");
        }
    }



    /**
     * 用户菜单
     * @return
     */
    public int uMenu(){
        System.out.println("请根据提示，进行取件");
        System.out.println("请输入您的取件码");
        String code = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(code);
        }catch (NumberFormatException e){

        }
        if (num>999999 || num<100000){
            System.out.println("暂无此快递，请重新输入");
            return uMenu();
        }
        return num;
    }
    public void expressExist(){
        System.out.println("快递已存在！请勿重新添加");
    }

    public void success(){
        System.out.println("取件成功");
    }

}
