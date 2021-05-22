package C02_OOP_07设计模式.b_dp.a_singleton.kkb2;
// 懒汉式单例：
//关键字 volatile 和 synchronized，能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资 源，这是懒汉式单例的缺点。
public class LazyEmperor {
    //保证emperor在所有线程中同步
    private static volatile LazyEmperor emperor=null;

    //构造方法私有，避免在类的外部创建对象
    private LazyEmperor() { }

    public static synchronized LazyEmperor getInstance(){
        if(emperor==null) {
            emperor=new LazyEmperor();
        }
        return emperor;
    }

    //皇帝办公
    public void work(){
        System.out.println("我是皇帝 hjg，有事起奏，无事退朝！");
    }
}
