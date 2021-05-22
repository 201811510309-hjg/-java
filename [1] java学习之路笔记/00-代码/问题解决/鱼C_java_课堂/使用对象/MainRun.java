package 问题解决.鱼C_java_课堂.使用对象;

/*
 * 应用程序的主类
 */

public class MainRun{

    public static void main(String[] args){
        FishcPeople xiaoJiaYu,nianHuaXiaoXian;                 //声明对象
        xiaoJiaYu = new FishcPeople();                         //为对象分配内存，使用默认的构造方法
        nianHuaXiaoXian = new FishcPeople();

        xiaoJiaYu.name = PersonName.小甲鱼;                     //对象xiaoJiaYu给自己的变量赋值
        xiaoJiaYu.height = 1.75f;
        xiaoJiaYu.weight = 70f;
        xiaoJiaYu.head = "大头";

        nianHuaXiaoXian.name = PersonName.拈花小仙;             //对象nianHuaXiaoXian给自己的变量赋值
        nianHuaXiaoXian.height = 1.66f;
        nianHuaXiaoXian.weight = 55f;
        nianHuaXiaoXian.head = "小头";

        System.out.println(xiaoJiaYu.name + "的身高：" + xiaoJiaYu.height);
        System.out.println(xiaoJiaYu.name + "的体重：" + xiaoJiaYu.weight);
        System.out.println(xiaoJiaYu.name + "的  头：" + xiaoJiaYu.head);
        System.out.println();

        System.out.println(nianHuaXiaoXian.name + "的身高：" + nianHuaXiaoXian.height);
        System.out.println(nianHuaXiaoXian.name + "的体重：" + nianHuaXiaoXian.weight);
        System.out.println(nianHuaXiaoXian.name + "的  头：" + nianHuaXiaoXian.head);
        System.out.println();

        xiaoJiaYu.speak(xiaoJiaYu.name + "：小仙吃冰淇淋");     //对象调用方法
        System.out.println(xiaoJiaYu.name + "现在的头：" + xiaoJiaYu.head);

        nianHuaXiaoXian.speak(nianHuaXiaoXian.name + "：我重" + nianHuaXiaoXian.weight + "公斤，伦家用小拳拳打你");   //对象调用方法
        System.out.println(nianHuaXiaoXian.name + "现在的头：" + nianHuaXiaoXian.head);
    }

}
