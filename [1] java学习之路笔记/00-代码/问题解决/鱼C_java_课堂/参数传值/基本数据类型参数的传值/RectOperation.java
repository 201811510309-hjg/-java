package 问题解决.鱼C_java_课堂.参数传值.基本数据类型参数的传值;

public class RectOperation{                     //主类

    public static void main(String[] args){
        Rect rect = new Rect();
        double w = 12.76,h = 25.28;
        rect.setWidth(w);
        rect.setHight(h);
        System.out.println("矩形对象的宽：" + rect.getWidth() + "高：" + rect.getHeight());
        System.out.println("矩形的面积：" + rect.getArea());
        System.out.println("更改向对象的方法参数传递值的 w、h 变量的值为 100 和 256");
        w = 100;
        h = 256;
        System.out.println("矩形对象的宽：" + rect.getWidth() + "高：" + rect.getHeight());
    }
    /**
     * 对于基本数据类型的参数，向该参数传递的值的级别不可以高于该参数的级别。例如，不可以向 int 型参数传递一
     *
     * 个 float 值，但可以向 double 型参数传递一个 float 值。在上面这个栗子中，有 2 个源文件，即 Rect.java 和
     *
     * RectOperation.java。其中，Rect.java 中的 Rect 类负责创建矩形对象，RectOperation.java 是含有主类的应用
     *
     * 程序。在主类的 main 方法中使用 Rect 类来创建矩形对象，该矩形对象可以调用 setWidth(double width) 设置
     *
     * 自己的宽，调用 setHeight(double height) 设置自己的高，因此，矩形对象在调用 setWidth(double width) 或
     *
     * setHeight(double height) 方法时，必须向方法的参数传递值。
     */

}