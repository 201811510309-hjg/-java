package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 15:11
 **/
/**
 * 对象创建的内存细节
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.name = "金苹果";
        b1.info = "讲述了果农辛勤种植金苹果的过程。";
        b1.say();

        Book1 b2 = b1;  //不是复制
        b2.name = "嘿嘿嘿";
        b1.say();
    }
}

class Book1{
    String name;
    String info;

    void say() {
        System.out.println("书名："+name+" , 简介："+info);
    }
}
