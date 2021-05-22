package D03_核心类库_03集合_数据结构_算法.算法设计.a0查找.b二分查找;
//完成一个课后思考题:
/*
 * 课后思考题： {1,8, 10, 89, 1000, 1000，1234} 当一个有序数组中，
 * 有多个相同的数值时，如何将所有的数值都查找到，比如这里的 1000
 *
 * 思路分析
 * 1. 在找到mid 索引值，不要马上返回
 * 2. 向mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
 * 3. 向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
 * 4. 将Arraylist返回
 */

import java.util.ArrayList;
import java.util.List;

public class BinarySearch2 {
    public static void main(String[] args) {
        int arr[] = { 1,8, 10, 89,1000,1000,1000,1234};
        List<Integer> resIndexList = binarrSearch(arr, 0, arr.length - 1, 1000);
        System.out.println("resIndexList=" + resIndexList);

    }


    public static List<Integer> binarrSearch(int[] arr,int left,int right,int findVal){
        // 当 left > right 时，说明递归整个数组，但是没有找到，目标值不在数组里面直接退出
        if (left > right){
            return new ArrayList<Integer>();
        }
        int mid = (left +right)/2;
        int midVal = arr[mid];
        if (findVal >midVal){
            return binarrSearch(arr,mid +1,right,findVal);
        }else if (findVal <midVal){
            return binarrSearch(arr,left,mid-1,findVal);
        }else {
//            * 1. 在找到mid 索引值，不要马上返回
//            * 2. 向mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
//            * 3. 向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
//            * 4. 将Arraylist返回
            List<Integer> resIndexlist = new ArrayList<Integer>();

            //2. 向 mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
            int temp = mid -1;
            while (true){
                if (temp < 0 || arr[temp] != findVal){
                    break;
                }
                //否则，就temp 放入到 resIndexlist
                resIndexlist.add(temp);
                temp-=1;
            }

            resIndexlist.add(mid);

            //3. 向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
            temp =mid +1;
            while (true){
                if (temp >arr.length -1 || arr[temp] != findVal){
                    break;
                }
                //否则，就temp 放入到 resIndexlist
                resIndexlist.add(temp);
                temp += 1; //temp右移

            }
            return resIndexlist;
        }
    }
}
