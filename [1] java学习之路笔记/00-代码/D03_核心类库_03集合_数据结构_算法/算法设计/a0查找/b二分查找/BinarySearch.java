package D03_核心类库_03集合_数据结构_算法.算法设计.a0查找.b二分查找;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 89,1000,1000, 1234 };
        int resIndex = binarrSearch(arr, 0, arr.length - 1, 1000);
//		System.out.println("resIndex=" + resIndex);
        System.out.println("找到了，它在第 "+(resIndex)+" 个位置");
    }

    /**
     *
     * @param arr 数组
     * @param left 左边的索引
     * @param right 右边的索引
     * @param findVal 要查找的值
     * @return 如果找到就返回下标，如果没有找到，就返回 -1
     */
    public static int binarrSearch(int[] arr,int left,int right,int findVal){
        // 当 left > right 时，说明递归整个数组，但是没有找到，目标值不在数组里面直接退出
        if (left > right){
            return -1;
        }
        int mid = (left +right)/2;
        int midVal = arr[mid];
        if (findVal >midVal){
            return binarrSearch(arr,mid +1,right,findVal);
        }else if (findVal <midVal){
            return binarrSearch(arr,left,mid-1,findVal);
        }else {
            return mid;
        }

    }
}
