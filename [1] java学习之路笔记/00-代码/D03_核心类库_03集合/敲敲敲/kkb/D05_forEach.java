package D03_核心类库_03集合.敲敲敲.kkb;

public class D05_forEach {
    //forEach   : 增强For 循环  最早在C#中
    // 用于迭代数组 或 集合
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        //使用增强for遍历数组
        for(int a : arr){
            //a代表数组中的每个元素
            System.out.print(a);
        }
    }
}
