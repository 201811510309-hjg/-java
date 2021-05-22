package C01_JAVA基础.a.c数组;

import java.util.Arrays;
import java.util.Scanner;

public class zy {
    public static void main(String[] args) {
        a1();//1、查找某个整数
        a2();
        //int[] z=a();//3、两数之和      --力扣
        //System.out.println(z[0]+" "+z[1]);
        a4();
        int[] z= a5();
        //System.out.println(z);
    }

    /**
     * 1、查找某个整数
     * 定义一个长度为 10 的整型数组 nums ，循环输入 10 个整数。
     * 然后将输 入一个整数，查找此整数，找到输出下标， 没找到给出提示。
     */
    public static void a1(){
        System.out.println("请输入10个数字。");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        if (input.hasNext()){
            for (int i=0;i<nums.length;i++){
                int num = input.nextInt();
                nums[i] = num;
            }
            for(int i=0;i<nums.length;i++) {System.out.print(nums[i]+" ");}
            System.out.println();
            System.out.println("输入一个整数，我来查找此整数。");
            int numa = input.nextInt();
            for(int i=0;i<nums.length;i++) {
                if (nums[i] == numa) {
                    i=i+1;
                    System.out.print("从左往右数第"+i+"个.");
                }}}else {System.out.println("你输入的是锤子");}
        }

    /**
     * 2、找出数组的最值
     * 定义一个长度为 10 的整型数组 nums ，循环输入 10 个整数。输出数组 的最大值、最小值。
     */
    public static void a2(){
        System.out.println("请输入10个数字。");
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        if(input.hasNextInt()) {
            for(int i=0;i<nums.length;i++) {
                int num = input.nextInt();
                nums[i] = num;
            }

            int max=nums[0],min=nums[0];
            for(int i=1;i<nums.length;i++) {
                //将数组中的每一个内容与n比较， 如果比n大， 则将n的值赋值为这个内容。
                min = min<nums[i]?min:nums[i];
                max = max>nums[i]?max:nums[i];

            }
            System.out.println("最大："+max+"  最小："+min);

        }
        else {System.out.println("你输入的是锤子");}
    }

    /**
     * 3、两数之和 --力扣1 梦开始的地方
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为 目标值的那两个整数，并输出他们的数组下标
     * 假设每种输入只会对应一个答案，不能重复利用这个数组中同样的元素。
     * 示例: 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以输出 0，1
     * @return
     */
    public static int[] a3(){
        //方法1
        int[] nums = {2,7,11,15};
        int target = 9;
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                int complement = target - nums[i];

                if(nums[j] == complement) {
                    //return new int[] {i,j};
                    System.out.println(i+" "+j);
                }
            }
        }
        //throw new IllegalArgumentException("no match found");
        return nums;


        //方法2  //还没学到哈希表，立个标志赶紧学后面的

//			Map<Integer,Integer>num_map = new HashMap<>();
//			for (int i=0;i<nums.length;i++) {
//				int complement = target - nums[i];
//
//				if(num_map.containsKey(complement)) {
//					return new int[] {num_map.get(complement),i};
//				}
//				num_map.put(nums[i], i);
//			}
//			throw new IllegalArgumentException("no match found");
    }

    /**
     * 4、排序并查找
     * 对数组{1，3，9，5，6，7，15，4，8}进行排序，然后使用二分查找 6 并 输出排序后的下标。
     */
    public static void a4(){
        int[] nums = {1,3,9,5,6,7,15,4,8};
        Arrays.sort(nums);
        for (int i : nums){System.out.print(i+" ");}

        int num = 6; //要查找的数据

        //关键的三个变量：
        int minIndex = 0; //1.	最小范围下标
        int maxIndex = nums.length-1;  //2.	最大范围下标
        int centerIndex = (minIndex+maxIndex)/2;  //3.	中间数据下标
        while(true) {
            //System.out.println("循环了一次");
            if(nums[centerIndex]>num) {
                //中间数据较大
                maxIndex = centerIndex-1;
            }else if(nums[centerIndex]<num) {
                //中间数据较小
                minIndex = centerIndex+1;
            }else {
                //找到了数据  数据位置：centerIndex
                break;
            }

            if(minIndex > maxIndex) {
                centerIndex = -1;
                break;
            }
            //当边界发生变化， 需要更新中间下标
            centerIndex = (minIndex+maxIndex)/2;
        }

        System.out.println("位置(从左往右)："+(centerIndex+1));
    }
    /**
     *5、移动零 --力扣
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保 持非零元素的相对顺序。
     * 示例: 输入: [0,1,0,3,12] 输出: [1,3,12,0,0]
     */
    public static int[] a5(){
        int[] nums = {0,1,0,3,12};
        for (int i : nums){System.out.print(i+" ");}
        System.out.println();

//			if(nums==null) {
//				return nums;
//			}
//			//第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
//			int j = 0;
//			for(int i=0;i<nums.length;++i) {
//				if(nums[i]!=0) {
//					nums[j++] = nums[i];
//				}
//			}
//			//非0元素统计完了，剩下的都是0了
//			//所以第二次遍历把末尾的元素都赋为0即可
//			for(int i=j;i<nums.length;++i) {
//				nums[i] = 0;
//			}
        //------------------------------------------------------------------

        if(nums==null) {
            return nums;
        }
        //两个指针i和j
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if(nums[i]!=0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }



        return nums;
    }



}

