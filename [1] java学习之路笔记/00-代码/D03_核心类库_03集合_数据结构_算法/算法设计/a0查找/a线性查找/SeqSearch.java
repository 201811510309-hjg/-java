package D03_核心类库_03集合_数据结构_算法.算法设计.a0查找.a线性查找;

public class SeqSearch {
    public static void main(String[] args) {
        // 没有顺序的数组
        int arr[] = {1, 9, 11, -1, 34, 89};
        int index = seqSearch(arr,-1);
        if (index == -1){
            System.out.println("没有找到》》》》");
        }else {
            System.out.println("找到了，它在第 "+(index+1)+" 个位置");
        }
    }

    /**
     *
     * @param arr
     * @param value
     * @return
     */
    public static int seqSearch(int[] arr , int value){
        //线性查找是逐一比对，发现有相同值，就返回下标
        for(int i = 0;i < arr.length;i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
