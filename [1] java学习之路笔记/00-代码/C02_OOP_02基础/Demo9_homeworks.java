package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 21:49
 **/

public class Demo9_homeworks {
    public static void main(String[] args) {
//        Car che = new Car("baoma","red");
//        che.show();

//        Game b1 = new Game();
//        b1.name = "金苹果游戏";
//        b1.introduction = "玩的是果农辛勤种植金苹果的过程。";
//        b1.say();
        Employee r = new Employee("hjg","1234567890",900,40);
        System.out.println(r.getName());
        System.out.println(r.getPhonenum());
        System.out.println(r.getBasepay());
        System.out.println("薪水增长额&&增长后的工资总额"+r.calculation());
    }

}
class  Car{
    Car(String brand,String color){
        this.color = color;
        this.brand = brand;
    }
    String brand;
    String color;

    void show(){
        System.out.println(brand+"车： "+color);
    }
}


class Game{
    //游戏名、类型、大小、星级、 介绍
    // name, type, size, star, introduction
    String name;
    String type;
    int size;
    int star;
    String introduction;

    void say(){
        System.out.println("Game名："+name+" ,介绍："+introduction);
    }

}

class Employee{  //代表员工\
    //“员工姓名”、 “员工号码”、“员工基本薪水”、“员工薪水增长率”
    String Name;
    String Phonenum;
    int Basepay;
    int Salary_growth_rate;  //eg..30,40,50--- 后面/100


    // “构造方法”、“获取员工姓名”、“获取员工号码”、“获取员工基本薪水”、 “计算薪水增长额”及“计算增长后的工资总额”
    Employee(String Name, String Phonenum, int Basepay, int Salary_growth_rate){
        this.Name = Name;
        this.Phonenum = Phonenum;
        this.Basepay = Basepay;
        this.Salary_growth_rate = Salary_growth_rate;


    }

    String getName(){ return this.Name; }

    String getPhonenum(){
        return this.Phonenum;
    }

    int  getBasepay(){
        return this.Basepay;
    }

    String  calculation(){
        int a = this.Basepay;
        int b = this.Salary_growth_rate;
        int c = a*(100+b)/100;  //增长后的工资总额
        int d = c-a; //薪水增长额
        return d+" "+c;
    }


}