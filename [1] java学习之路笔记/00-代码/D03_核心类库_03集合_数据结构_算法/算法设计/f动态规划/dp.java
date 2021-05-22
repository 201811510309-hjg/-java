package D03_核心类库_03集合_数据结构_算法.算法设计.f动态规划;

public class dp {
    //# 递归的的斐波那契数列解决方法 时间复杂度O(2^n)
    public  long fibonacci(int n) throws Exception{
        //特殊情况，分开讨论
        if (n == 1 || n == 2) { return 1; }
        if (n > 2) { return fibonacci(n - 1) + fibonacci(n - 2); }//递归调用
        return -1;              //如果输入错误的n，一律返回-1
    }

//    # 记忆化搜索
    public static long fibonacci1(int n) {
        int[] memo = new int[n + 1]; // 自定义数组的默认值都为0
        if (n == 0) { return 0; }
        if (n == 1) { return 1; }
        // 当数组的值为0时，才进行迭代
        if (memo[n] == 0) { memo[n] = (int) (fibonacci1(n - 1) + fibonacci1(n - 2)); }
        return memo[n];
    }
//    # 动态规划 先解决小数据量的 再层层递推的解决大数据量级的问题 时间复杂度O(n)
    public static long fibonacci2(int n){
        long f0 = 1, f1 = 1;
        long f2 = 0;
        for(long i = 3; i <= n; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }

    /**
     * 阶乘
     * @param
     * @return
     */
    /*public int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("负数没有阶乘");
        } else if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }*/

    public static void main(String[] args) {
//        System.out.println(fibonacci(100));
//        System.out.println(fibonacci1(100));
        System.out.println(fibonacci2(30));


    }

}
