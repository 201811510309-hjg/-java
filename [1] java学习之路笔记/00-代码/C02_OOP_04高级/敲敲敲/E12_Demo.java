package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 21:42
 **/
//包装类
public class E12_Demo {
    public static void main(String[] args) {
        Integer o;//Ctrl+鼠标
        //装箱和拆箱操作
        //手动装箱  1.5之前
        Integer i = new Integer(250);
        //手动拆箱  1.5之前
        int a = i.intValue();
        System.out.println(a);

        //自动装箱和拆箱操作
        Integer j = 200;
        int b = j;
    }

}
