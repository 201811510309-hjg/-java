package D03_核心类库_03集合_数据结构_算法.数据结构.递归回溯.c八皇后;

public class Queue8 {
    int max = 8;
    int [] array = new int[max];
    static int count=0;
    static int judgeCount = 0;
    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有%d解法", count);
        System.out.printf("一共判断冲突的次数%d次", judgeCount); // 1.5w

    }
    //编写一个方法，放置第n个皇后
    //特别注意： check 是 每一次递归时，进入到check中都有  for(int i = 0; i < max; i++)，因此会有回溯
    private void check(int n) {
        if (n ==max){
            print();
            return;
        }
        for(int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)){
                check(n+1);
            }
        }

    }


    //查看当我们放置第n个皇后, 就去检测该皇后是否和前面已经摆放的皇后冲突
    private boolean judge(int n) {
        judgeCount++;
        for (int i=0;i<n;i++){
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }




    //编写一个方法，可以将皇后摆放的位置打印出来
    private void print(){
        count++;
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
