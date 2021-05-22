package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 21:31
 **/

public class Demo6 {
    public static void main(String[] args) {
        Person3 p = new Person3("张三",18);
        p.say();

        Person3 p2 = new Person3("李四");
        p2.age = 15;
        p2.say();
    }
}

class Person3{
    Person3(String name2,int age2){
        name = name2;
        age = age2;
    }

    Person3(String name2){
        name = name2;
    }

    Person3(){

    }

    String name;
    int age;

    void say() {
        System.out.println("自我介绍： 姓名："+name+", 年龄："+age);
    }

}