package D03_核心类库_03集合.zy.快递hjg.view;

import C02_OOP_06异常处理.快递hjg.Express;

import java.util.Scanner;

public class View {
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

    private Scanner input = new Scanner(System.in);
    /**
     * 身份选择
     * @return
     */
    public int memu(){
        System.out.println("请根据提示，选择功能序号");
        System.out.println("1. 快递员");
        System.out.println("2. 用户");
        System.out.println("3. 退出");
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
        if (num >3 || num <1){
            System.out.println("输入有误，请重新输入。。");
            return memu();
        }
        return num;
    }

    /**
     * 快递员可操作功能
     */
    public int cMenu(){
        System.out.println("请根据提示，选择功能序号");
        System.out.println("1. 存快递");
        System.out.println("2. 改快递");
        System.out.println("3. 删快递");
        System.out.println("4. 查看所有");
        System.out.println("0. 退出");
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
        if (num >4 || num <0){
            System.out.println("输入有误，请重新输入。。");
            return memu();
        }
        return num;
    }
    /**
     * 存快递
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
     * 改快递
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
     * 查看所有
     */
    public void printAll(Express [][] es){
        int count = 0;
        for(int i = 0;i<10 ;i++){
            for (int j=0;j<10;j++){
                if(es[i][j] != null){
                    count++;
                    System.out.println("第"+(i+1)+"排 "+"第"+(j+1)+"列");
                    printExpress(es[i][j]);
                }
            }
        }
        if (count == 0){
            System.out.println("暂无快递信息");
        }
    }

    /**
     * 打印快递信息
     * @param e
     */
    public void printExpress(Express e) {
        System.out.println("快递信息如下");
        System.out.println("快递单号："+e.getNumber()+"，快递公司："+e.getConpany()+",取件码："+e.getCode());
    }


    /**
     * 用户享受服务
     */
    public int uMenu(){
        System.out.println("输入您的宝贝取件码");
        String text = input.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }
        if (num >999999 || num <100000){
            System.out.println("查无此物，可能是您输错了，请重新输入。。");
            return memu();
        }
        return num;
    }


    public void printNull() {
        System.out.println("查无此物，可能是您输错了，");
    }

    public void success() {
        System.out.println("取件成功");
    }

    public void expressExist() {
        System.out.println("快递已存在！请勿重新添加");
    }
}
