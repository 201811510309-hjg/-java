package C02_OOP_03进阶;

/**
 * @quther hjg
 * @date 2021/1/28 22:57
 **/
//this
public class D2 {
    public static void main(String args[]){
        Person2 per1 = new Person2("张三",12);
        Person2 per2 = new Person2("李四",13);
        per1.say();
        per2.say();

        Person2 per3 = new Person2();
        per3.say();
    }
}

class Person2{
    private String name;
    private int age;

    Person2(){
        this("默认姓名",1);
        System.out.println("hjgj");
        //在一个构造方法中，调用另一个构造方法时，调用的代码必须编写在构造方法的第一行。
    }
    Person2(String name,int age){
        this.age = age;
        this.name = name;

    }
    void say(){
        System.out.println("姓名"+this.name+",年龄："+this.age);
    }
}
