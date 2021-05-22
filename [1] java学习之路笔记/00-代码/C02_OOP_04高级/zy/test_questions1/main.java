package C02_OOP_04高级.zy.test_questions1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserService u = new UserService();
        int i = 3;
        while (i != 0){
            System.out.print("账号：");
            String a = input.nextLine();
            System.out.print("密码：");
            String b = input.nextLine();
            if(u.login(a,b)){
                break;
            }else {
                if (i-1 == 0){
                    System.out.println("你没有机会了，再也不见。。");
                    break;
                }
                System.out.println("你还有"+(i-1)+"次机会！，请重新输入。");
            }
            i--;

        }

    }
}

/**
 * 模拟银行卡密码输入验证功能，共有三次输入机会。输入字符串类型的数字密码，验证密码是否等于121234，若是则输出“登录成功”，若不是，前两次返回“输入不正确，请重新输入”，第三次输入不正确返回“密码输入已达上限，请明日再试”。
 */
