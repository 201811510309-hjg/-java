package C02_OOP_07设计模式.b_dp.a_singleton.kkb3;

import java.util.ArrayList;
import java.util.Random;
//单例模式的扩展
//单例模式可扩展为有限的多例（Multitcm）模式，这种模式可生成有限个实例并保存在 ArmyList 中，客户需要时 可随机获取。
public class Emperor {
    //皇帝的姓名属性
    private String name;
    //定义最多能产生的实例的数量
    private static final int maxNum=2;
    //定义盛放所有皇帝实例的列表
    private static ArrayList<Emperor> list=new ArrayList<Emperor>(2);
    //产生所有的皇帝对象
    static { for (int i=0;i<maxNum;i++){
        list.add(new Emperor("皇帝"+i));
    }
    }
    //构造方法私有，避免在类的外部创建对象
    private Emperor() { }
    private Emperor(String name) { this.name=name; }
    //随机获取一个皇帝对象  点儿正
    public static Emperor getInstance(){
        int index=new Random().nextInt(maxNum);
        return list.get(index);
    }

    //皇帝办公
    public void work(){
        System.out.println("我是"+name+"，有事起奏，无事退朝！");
    }
}
