package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/29 22:05
 **/
/* super:
    迪过 super ,可以访问父类构造方法

    通过 super ,可以访问父类的属性
    通过 super ,可以访问父类的方法

* */
public class D2 {
    public static void main(String[] args) {
        Person2 s = new Student2();
//        s.setAge(15);
//        s.setName("hjg");
        s.say();
    }
}

class Person2{ // 封装 private
    private String name ; // 表示姓名
    private int age ; // 表示年龄
    public String sex;


    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2() {
    }

    public void setName(String str){ name = str ; }
    public String getName(){ return name ; }

    public void setAge(int a){ if(a>0&&a<150) age = a ; }
    public int getAge(){ return age ; }


    void say(){
        System.out.println("姓名：" + getName() + "；年龄：" + getAge()+" "+sex) ;
    }



}
class Student2 extends Person2{   //子类创建几个就会在堆里面自动创建几个父类对象
    public Student2(){
        super("hjg1",1);
        super.sex = "男";  //public
        super.setName("hahaha");
    }
}
