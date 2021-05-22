package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 21:13
 **/

public class Demo3_1 {
    public static void main(String[] args) {
        Book2 b1 = new Book2();
        b1.name = "金苹果";
        b1.info = "讲述了果农辛勤种植金苹果的过程。";

        Book2 b2 = new Book2();
        b2.name = "银苹果";
        b2.info = "讲述了果农辛勤种植银苹果的过程。";

        b2 = b1;
        b2.name = "铜苹果";
        b1.say();
    }
}
class Book2{
    String name;
    String info;

    void say() {
        System.out.println("书名："+name+" , 简介："+info);
    }
}