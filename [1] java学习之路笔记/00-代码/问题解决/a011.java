package 问题解决;

public class a011 {


    public static void main(String[] args) {
        int a = 8;
        decimalToBinary(a);

        long x = 0123;
        System.out.println(x);


    }

    private static void decimalToBinary(int num) {
        if (num<1){return;}
        decimalToBinary(num/2);
        System.out.print(" "+ num%2);
    }
}
