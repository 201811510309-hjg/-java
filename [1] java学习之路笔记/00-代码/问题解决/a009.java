package 问题解决;

import java.util.Scanner;

public class a009 {


    public static void main(String[] args) {

        System.out.println((int) Math.pow(2,10));

        Scanner input = new Scanner(System.in);
        //结果
        double result = 0;
        //底数
        System.out.print("请输入底数：");
        double base = input.nextDouble();
        //指数
        System.out.print("请输入指数：");
        int exponent = input.nextInt();

        for (int i = 0;i<exponent;i++){
            if ( 0 != result){
                result = result *base;
            }else {
                result = base;
            }
        }
        System.out.println("结果是："+result);

        //System.out.println(myPow(base,exponent));

    }

    public static  double myPow(double x, int n){
        boolean isNegative = false;
        if (n<0){
            x = 1/x;
            isNegative = true;
            n = -(n+1);
        }

        double ans = 1,tmp = x;
        while (n!=0){
            if (n%2 == 1){
                ans *= tmp;
            }
            tmp *=tmp;
            n/=2;

        }
        if (isNegative) {
            ans *= x;
        }
        return ans;
    }


}
