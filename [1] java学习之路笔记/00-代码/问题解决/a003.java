package 问题解决;

/*
四个数字中的最小值
*/

import java.util.Arrays;

public class a003 {
    public static int min(int a, int b, int c, int d) {
        //在此编写你的代码
        int array[] = { a,b,c,d };
        Arrays.sort(array);
        return array[0];

    }

    public static int min(int a, int b) {
        //在此编写你的代码
        int array[] = { a,b };
        Arrays.sort(array);
        return array[0];

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}

