package C02_OOP_03进阶;

/**
 * @quther hjg
 * @date 2021/1/28 15:03
 **/

public class D1 {
    public static void main(String args[]){
        Person per = new Person();
        per.setName("张三") ;
        per.setAge(-30) ;
        per.tell() ;
    }
}
class Person{
    // 封装 private
    private String name ; // 表示姓名
    private int age ; // 表示年龄

    public void setName(String str){ name = str ; }
    public String getName(){ return name ; }

    public void setAge(int a){ if(a>0&&a<150) age = a ; }
    public int getAge(){ return age ; }

    void tell(){
        System.out.println("姓名：" + getName() + "；年龄：" + getAge()) ;
    }

}