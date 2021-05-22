package C02_OOP_03进阶;

/**
 * @quther hjg
 * @date 2021/1/29 10:45
 **/

public class D4 {
    public static void main(String[] args) {
        String s; // String源码后面会讲

        Person3 p1 = new Person3();
        Person3 p2 = new Person3();

    }
}

class Person3{
    private String name;
    private int age;
    static {
        System.out.println("静态代码块执行"); //就一次

    }

    {
        System.out.println("对象创建时执行1");
    }

    public Person3() {
        System.out.println("对象创建时执行2");

    }

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person3(String name) {
        this.name = name;
    }

    public Person3(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}