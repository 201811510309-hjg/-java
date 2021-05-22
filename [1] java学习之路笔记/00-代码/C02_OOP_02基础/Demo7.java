package C02_OOP_02基础;
/**
 * @quther hjg
 * @date 2021/1/28 21:35
 **/
public class Demo7 {
    /**
     * 匿名	:	没有名字
     */
    public static void main(String[] args) {
//        Math2 m = new Math2();
//        int num = m.sum(100,200);

        //下面这里没有m
        int num = new Math2().sum(300, 200);
        System.out.println(num);
    }
}
class Math2{
    int sum(int x,int y) {
        return x+y;
    }
}
