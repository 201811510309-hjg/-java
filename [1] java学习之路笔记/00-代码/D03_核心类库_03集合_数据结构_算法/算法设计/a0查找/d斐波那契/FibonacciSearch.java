package D03_核心类库_03集合_数据结构_算法.算法设计.a0查找.d斐波那契;

import java.util.Arrays;

//增长数列达到黄金分割
//被查找的数组要有序
public class FibonacciSearch {
    public static int maxSize = 20;

    public static void main(String[] args) {
        int [] arr = {1,8, 10, 89, 1000, 1234};
        System.out.println("index=" + fibSearch(arr, 89));// 0

    }

    //后面 mid=low+F(k-1)-1 ，需要使用到斐波那契数列，因此我们需要先获取到一个斐波那契数列
    //非递归方法得到一个斐波那契数列
    public static int[] fib() {
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
    //编写斐波那契查找算法
    //使用非递归的方式编写算法
    /**
     *
     * @param a  数组
     * @param key 我们需要查找的关键码(值)
     * @return 返回对应的下标，如果没有-1
     */
    public static int fibSearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int k = 0; //表示斐波那契分割数值的下标
        int mid = 0; //存放mid值
        int f[] = fib(); //获取到斐波那契数列
        //获取到斐波那契分割数值的下标
        while(high > f[k] - 1) {
            k++;
        }
        //因为 f[k] 值 可能大于 a 的 长度，因此我们需要使用Arrays类，构造一个新的数组，并指向temp[]
        //不足的部分会使用0填充
        int[] temp = Arrays.copyOf(a, f[k]);//原数组 a 长度 k
        //实际上需求使用a数组最后的数填充 temp
        //举例:
        //temp = {1,8, 10, 89, 1000, 1234, 0, 0}  => {1,8, 10, 89, 1000, 1234, 1234, 1234,}
        for(int i = high + 1; i < temp.length; i++) {
            temp[i] = a[high];
        }

        // 使用while来循环处理，找到我们的数 key
        while (low <= high) { // 只要这个条件满足，就可以找
            mid = low + f[k - 1] - 1;
            if(key < temp[mid]) { //我们应该继续向数组的前面查找(左边)
                high = mid - 1;
                k--;
            } else if ( key > temp[mid]) { // 我们应该继续向数组的后面查找(右边)
                low = mid + 1;
                k -= 2;
            } else { //找到
                //需要确定，返回的是哪个下标
                if(mid <= high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;
    }
}
