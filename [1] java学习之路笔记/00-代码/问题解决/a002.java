package 问题解决;
//https://fishc.com.cn/thread-193020-1-1.html
public class a002 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
