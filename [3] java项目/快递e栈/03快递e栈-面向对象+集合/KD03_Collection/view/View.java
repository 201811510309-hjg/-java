package KD03_Collection.view;


import KD03_Collection.bean.Express;
import java.util.Collection;
import java.util.Scanner;
/**
 * 视图层
 * 只负责展示视图 不包含其他任何逻辑
 */
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
        System.out.print("1. 快递员    ");
        System.out.print("2. 用户 ");
        System.out.print("3. 退出 ");
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
        System.out.print("1. 存快递    ");
        System.out.print("2. 改快递    ");
        System.out.print("3. 删快递    ");
        System.out.print("4. 查看所有   ");
        System.out.print("0. 退出 ");
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
     * 返回包含了快递单号和快递公司的快递对象
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
     * 4遍历显示所有快递信息
     * @param es
     */
    public void printAll(Collection<Express> es){
        int count = 0;
        for(Express e : es) {
            count++;
            System.out.print("第" + (e.posX + 1) + "排，" + (e.posY + 1) + "列, ");
            printExpress(e);
        }
        if(count == 0){
            System.out.println("暂无快递信息");
        }
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
    public void printExpress(Express e) {
        if ( e == null ){
            System.out.println("快递不存在");
            return;
        }
        System.out.println("快递信息如下");
        System.out.println("快递单号："+e.getNumber()+"，快递公司："+e.getConpany()+",取件码："+e.getCode());
    }


    /**
     * 用户享受服务
     * 获得用户输入的取件码（这里简化，只要取件码相同，就算取件成功）
     * @return 用户输入的合法功能码(6位)
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


    public void printCode(Express e) {
        System.out.println("新快递的取件码为：" + e.getCode());
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
