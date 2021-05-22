package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 22:06
 **/
//可变参数
    //注意：可变参数只能出现在参数列表的最后
public class E13 {
    public static void main(String[] args) {
        String a="as";
        System.out.println(sum(a));
        System.out.println(sum(a,1));
        System.out.println(sum(a,1,2));
        System.out.println(sum(a,1,2,3));

    }

    public  static int sum(String a,int... nums){  //参数在方法内部 ， 以数组的形式来接收
        int n = 0;
        for (int i = 0;i<nums.length;i++){
            n+=nums[i];
        }
        return n;
    }
}
