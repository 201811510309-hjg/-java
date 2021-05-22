package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/29 15:41
 **/
//extends 继承
/*继承是java面向对象编程技术的一块基石，因为它允许创建分等级层次的类。
 *继承就是子类继承父类的特征和行为，使得子类对象(实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。

* 格式：
*       class 父类{}
*
*       class 子类 extends 父类{}
*
* */



public class D1 {
    public static void main(String[] args) {
        Person s = new Student();
        s.setAge(15);
        s.setName("hjg");
        s.say();
    }
}

class Person{ // 封装 private
    private String name ; // 表示姓名
    private int age ; // 表示年龄

    public void setName(String str){ name = str ; }
    public String getName(){ return name ; }

    public void setAge(int a){ if(a>0&&a<150) age = a ; }
    public int getAge(){ return age ; }


    void say(){
        System.out.println("姓名：" + getName() + "；年龄：" + getAge()) ;
    }



}
class Student extends Person{

}