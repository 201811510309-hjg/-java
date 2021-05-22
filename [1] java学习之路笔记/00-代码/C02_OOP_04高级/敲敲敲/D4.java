package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/29 23:15
 **/
//final关键字
/*
*final关键字
    final用于修饰属性、变量。
        变量成为了常量，无法对其再次进行赋值。
        final修饰的局部变量，只能赋值一次(可以先声明后赋值)final修饰的是成员属性，必须在声明时赋值。
        全局常量( public static final )
        *
        常量的命名规范:
            由1个或多个单词组成，单词与单词之间必须使用下划线隔开，单词中所有字母大写
            * 例如:sQL_INSERT
    *
    final用于修饰类;
        final修饰的类，不可以被继承。
    final用于修饰方法
        final修饰的方法，不能被子类重写。

* */

public class D4 {
    public static void main(String[] args) {
        final int a; //局部变量，没有赋值，只能赋值一次
    }
}
