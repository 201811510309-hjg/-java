package 问题解决.欧拉计划;
/**
 * 题目1：找出1000以下自然数中3和5的倍数之和
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 题目：
 * 10 以下的自然数中，属于 3 或 5 的倍数的有 3, 5, 6 和 9，它们之和是 23。
 * 找出 1000 以下的自然数中，属于 3 或 5 的倍数的数字之和
 */
public class e001 {

    public static void main(String[] args) {
        //int sum = 0,a=1000;
        /*for (int i=0;i<1000;i++){
            if (i%3 == 0 | i%5 == 0 | i%15 ==0){
                sum = sum +i;
                System.out.println(i);
                i = i+1;

            }
            else{
                i = i+1;
            }
        }*/
        /*int s = 1000;
        for(int i=0;i<s;i++)
        {
            if(i%3==0) sum+=i;
        }
        for(int j=0;j<s;j++)
        {
            if(j%5==0) sum+=j;
        }
        for(int k=0;k<s;k++)
        {
            if(k%15==0) sum-=k;
        }*/
        /*for (int i = 0;i < a;i++){
            int b = i * 3;
            int c = i * 5;
            if(b != c){
                sum = b+c+sum;
            }else {
                sum = sum + b;
            }
        }*/

        int a01=3,a02=5,b=999;
        System.out.println(sumcount(a01,b)+
                sumcount(a02,b)-sumcount(a01*a02,b));
    }

    static int sumcount(int a1, int b){
        int n = (int) (b/a1);
        int an = a1 + a1*(n-1);
        return (n*(a1+an)/2);
    }

}
