package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 22:17
 **/
//递归  阶乘
public class E14 {
    public static void main(String[] args) {
        int n = digui(5);
        System.out.println(n);

    }

    public static int digui(int n){
        if (n == 1){
            return 1;
        }else {
            return n*digui(n-1);
        }
    }
}
