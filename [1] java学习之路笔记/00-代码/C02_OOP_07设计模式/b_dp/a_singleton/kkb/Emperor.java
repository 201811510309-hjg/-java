package C02_OOP_07设计模式.b_dp.a_singleton.kkb;

public class Emperor {
    private static Emperor emperor=null;
    //构造方法私有，避免在类的外部创建对象
    private Emperor() { }
    public static Emperor getInstance(){
        if(emperor==null) {
            emperor=new Emperor();
        }
        return emperor;
    }
    //皇帝办公
    public void work(){
        System.out.println("我是皇帝 hjg，有事起奏，无事退朝！");
    }
}
