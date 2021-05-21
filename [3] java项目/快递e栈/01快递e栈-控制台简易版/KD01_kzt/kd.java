package KD01_kzt;

import java.util.Scanner;

public class kd {
    //默认存储1000条记录
    static int length = 1000;
    static int[] deliveryNumber = new int[length];  //单号
    static String[] companys = new String[length];  //公司
    static int[] deliveryCode = new int[length];    //取件码
    //用于存储快递的index
    static int index = 0;

    public static void main(String[] args) {
        startSession();
    }
    //开始会话
    private static void startSession() {
        System.out.println("=====欢迎使用hjg快递柜=====");
        System.out.println("请输入您的身份：1-快递员，2-用户");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch (type){
            case 1:
                deliveryChoose();
            case 2:
                userChoose();
            default:
                System.out.println("输入您的身份请选择1或者2！");
                startSession();
        }


    }
    //用户操作
    private static void userChoose() {
        boolean isPick = false;
        System.out.println("请输入取件码：");
        Scanner userCho = new Scanner(System.in);
        int code = userCho.nextInt();
        for (int i = 0; i < length - 1; i++) {
            if (code == deliveryCode[i]) {
                deliveryNumber[i] = 0;
                companys[i] = "";
                deliveryCode[i] = 0;
                isPick = true;
                break;
            }
        }
        if(isPick)
            System.out.println("取件成功");
        else
            System.out.println("未找到该快递");
        startSession();
    }

    //快递员操作
    private static void deliveryChoose() {
        System.out.println("请选择操作：1-存快递 2-删除快递 3-修改快递信息 4-查看所有快递 5-回到上一级" );
        Scanner delivertCho = new Scanner(System.in);
        int decision = delivertCho.nextInt();
        switch (decision) {
            case 1:
                saveDelivery();
            case 2:
                deleteDelivery();
            case 3:
                modifyDelivery();
            case 4:
                checkDelivery();
            case 5:
                startSession();
            default:
                System.out.println("输入有误，请重新开始");
                startSession();
        }
    }
    //4-查看所有快递
    private static void checkDelivery() {
        System.out.println("所有快递信息如下: ");
        System.out.printf("%-9s%-9s%-9s\n", "快递单号", "公司名称", "取件码");
        for (int i = 0; i < length - 1; i++) {
            if (deliveryNumber[i] != 0 && deliveryCode[i] != 0) {
                System.out.printf("%-12d%-12s%-12d\n", deliveryNumber[i], companys[i], deliveryCode[i]);
            }
        }
        deliveryChoose();
    }
    //3-修改快递信息
    private static void modifyDelivery() {
        boolean isModify = false;
        System.out.println("请输入要修改的快递单号: ");
        Scanner modify = new Scanner(System.in);
        int modifyNumber = modify.nextInt();
        for (int i = 0; i < length - 1; i++) {
            if (deliveryNumber[i] == modifyNumber) {
                System.out.println("请输入新的快递单号: ");
                Scanner newNumber = new Scanner(System.in);
                int newModifyNumber = newNumber.nextInt();
                System.out.println("请输入新的公司名称: ");
                Scanner newCompany = new Scanner(System.in);
                String newModifyCompany = newCompany.next();
                deliveryNumber[i] = newModifyNumber;
                companys[i] = newModifyCompany;
                isModify = true;
                break;
            }
        }
        if(isModify)
            System.out.println("修改成功");
        else
            System.out.println("未找到对应快递");
        deliveryChoose();
    }
    //2-删除快递
    private static void deleteDelivery() {
        boolean isDelete = false;
        System.out.println("请输入要删除的快递单号: ");
        Scanner delete = new Scanner(System.in);
        int deleteNumber = delete.nextInt();
        for (int i = 0; i < length - 1; i++) {
            if (deliveryNumber[i] == deleteNumber) {
                deliveryNumber[i] = 0;
                companys[i] = "";
                deliveryCode[i] = 0;
                isDelete = true;
                break;
            }
        }
        if (isDelete)
            System.out.println("删除成功");
        else
            System.out.println("未找到快递");
        deliveryChoose();
    }
    //1-存快递
    private static void saveDelivery() {
        System.out.println("请输入快递单号: ");
        Scanner deliverNumber = new Scanner(System.in);
        deliveryNumber[index] = deliverNumber.nextInt();
        System.out.println("请输入公司名称: ");
        Scanner companyStr = new Scanner(System.in);
        companys[index] = companyStr.next();
        int randomNum = (int) Math.round((Math.random() + 1) * 1000);
        deliveryCode[index] = randomNum;
        System.out.println("快递已存入，取件码是: " + randomNum);
        index++;
        deliveryChoose();
    }
}
