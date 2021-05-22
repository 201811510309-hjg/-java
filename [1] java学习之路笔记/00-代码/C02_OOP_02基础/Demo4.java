package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 21:18
 **/

public class Demo4 {
    public static void main(String[] args) {
        //System.out.println("1");
        Person2 p1 = new Person2("张三");
        //System.out.println("2");
        //p1.name  = "张三";
        p1.age = 18;
        p1.say();
    }

}


class Person2{

    Person2(String n){ //用于对象初始化。
        name = n;
    }

    String name;
    int age;

    void say() {
        System.out.println("自我介绍。我是:"+name+" , 我的年龄:"+age);
    }

}