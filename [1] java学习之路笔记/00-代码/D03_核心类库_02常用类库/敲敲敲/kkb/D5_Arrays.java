package D03_核心类库_02常用类库.敲敲敲.kkb;

import java.util.Arrays;

public class D5_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,5,6,7,8,2,3,4,9};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,2)); //下标

        System.out.println();
        System.out.println(arr.length);
        arr = Arrays.copyOf(arr,15);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
