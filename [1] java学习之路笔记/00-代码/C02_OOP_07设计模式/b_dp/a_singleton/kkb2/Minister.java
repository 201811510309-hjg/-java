package C02_OOP_07设计模式.b_dp.a_singleton.kkb2;

public class Minister {
    public static void main(String[] args) {
        //每天见面的都是同一个皇帝
        for (int i=1;i<=5;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+i+"天：");
            emperor.work();
        }
    }
}
