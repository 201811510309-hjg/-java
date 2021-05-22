package D03_核心类库_03集合_数据结构_算法.算法设计.a二分查找非递归;

public class BinarySearchNoRecur {
    public static void main(String[] args) {
        int[] arr = {1,3, 8, 10, 11, 67, 100};
        int index = binarySearch(arr, 100);
        System.out.println("index=" + index);
    }

    //二分查找的非递归实现
    /**
     *
     * @param arr 待查找的数组, arr是升序排序
     * @param target 需要查找的数
     * @return 返回对应下标，-1表示没有找到
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        while (left <= right ){ //说明继续查找
            int mid = (left +right)/2;
            if (arr[mid] == target){
                return  mid;
            }else if (arr[mid] >target){  //需要向左边查找
                right =mid -1;
            }else {
                left = mid +1; //需要向右边查找
            }
        }
        return -1;
    }
}
