package 问题解决.欧拉计划;

public class e002 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fib(s.shu())
                +"最接近4000000的那个斐波第："+ s.shu()+"个数。。。");
    }
    static class Solution {
        public int shu(){
            while (true){
                //递推关系
                int prev = 0,curr = 1,count=0;
                for (int i = 2;;i++){
                    int sum = prev + curr;
                    prev = curr;
                    curr = sum;
                    count++;
                    if (sum >4000000){
                        break;
                    }
                }
                return count;
            }
        }
        //最优化解法
        public double fib(int n) {
            double count = 0;
            //base case
            if (n==0 || n==1) return n;

            //递推关系
            int prev = 0,curr = 1;
            for (int i = 2;i<= n;i++){
                int sum = prev + curr;
                prev = curr;
                curr = sum;
                if (sum % 2 == 0){
                    count = count+sum;
                }
            }
            return count;
        }
    }
}
