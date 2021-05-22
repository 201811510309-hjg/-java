package C02_OOP_03进阶;

/**
 * @quther hjg
 * @date 2021/1/28 23:12
 **/
//static

public class D3 {
    public static void main(String[] args) {
        Emp.region = "福建";

        Emp e1 = new Emp("1");
        Emp e2 = new Emp("2");
        Emp e3 = new Emp("3");
        Emp e4 = new Emp("4");
        Emp e5 = new Emp("5");
        e1.say();
        e2.say();
        e3.say();
        e4.say();
        e5.say();

        Emp e6 = new Emp();
        System.out.println(Emp.count);

    }
}

class Emp{
    private String name;
    static String region;
    static int count = 0;

     Emp(String name, String region) {
         count++;
        this.name = name;
        this.region = region;
    }
    Emp(){count++;}
    Emp(String name){
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    void say(){
         System.out.println("姓名："+this.name+"地区："+region);
         //say2();
    }

    static void say2(){
        System.out.println("姓名："+"地区："+region);
        //say();  //在访问时： 静态不能访问非静态 , 非静态可以访问静态 !
    }
}