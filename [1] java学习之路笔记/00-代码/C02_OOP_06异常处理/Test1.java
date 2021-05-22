package C02_OOP_06异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int num = menu();
        System.out.println("你输入的是:"+num);
    }


    public static int menu(){
        System.out.println("请根据提示,选择功能序号:");
        System.out.println("1. 增加XX");
        System.out.println("2. 删除XX");
        System.out.println("3. 修改XX");
        System.out.println("0. 退出");

        Scanner input = new Scanner(System.in);
        int num = -1;
        try{
            num = input.nextInt();
            if(num<0 || num>3){
                //程序有问题 , 输入有误
                System.out.println("功能序号必须是: 0/1/2/3");
                return menu();
            }
            return num;
        }catch(InputMismatchException e){ //由 Scanner抛出，表示检索到的令牌与预期类型的模式不匹配，或者令牌超出预期类型的范围。
            //System.out.println("哈哈哈, 程序出错了.");
            //补救  ------++++
            System.out.println("必须输入数字哦");
            return menu();
        }
    }
}
