package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 17:28
 **/
//成员内部类
public class D8_Demo {
    public static void main(String[] args) {
        D8_Outer o = new D8_Outer();
        o.setX(100);

        D8_Outer.Inner i = o.new Inner();
        i.say();
    }
}
