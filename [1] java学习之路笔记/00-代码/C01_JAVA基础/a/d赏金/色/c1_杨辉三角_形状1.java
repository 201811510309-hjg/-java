package C01_JAVA基础.a.d赏金.色;

import java.util.Scanner;

public class c1_杨辉三角_形状1 {
    public static void main(String[] args) {
        System.out.println("请输入n");
        Scanner cin = new Scanner(System.in);
        int rows=cin.nextInt();
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }


    }
}
