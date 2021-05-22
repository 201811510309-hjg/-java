package C02_OOP_07设计模式.b_dp.a_singleton.kkb2;
//饿汉式单例：
//该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。而且该方式是线 程安全的。
public class HungryEmperor {
    ////实例化一个皇帝
    private static final  HungryEmperor emperor = new HungryEmperor();
    //构造方法私有，避免在类的外部创建对象
    private HungryEmperor() { }
    public static HungryEmperor getInstance(){
        return emperor;
    }
    //皇帝办公
    public void work(){
        System.out.println("我是皇帝 hjg，有事起奏，无事退朝！");
    }
}
