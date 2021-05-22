package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/29 22:56
 **/
/*
* 重写(override）规则:
        1、参数列表必须完全与被重写方法的相同;
        2、返回类型必须完全与被重写方法的返回类型相同;
        3、访问权限不能比父类中被重写的方法的访问权限更低。
            * 例如。如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected.
        4、父类的成员方法只能被它的子类重写。
        5、声明为static和privete的方法不能被重写，但是能够被再次声明。

* 面试题:
java中重写(override）与重载（Overload)的区别
    1、发生的位置
        重载:一个类中
        重写:子父类中
    2、参数列表限制
        重载:必须不同的
        重写:必须相同的
    3、返回值类型
         重载:与返回值类型无关
         重写:返回值类型必须一致
    4、访问权限:
        重载:与访问权限无关
        重写:子的方法权限必须不能小于必父的方法权限
    5、异常处理:
        重载:于异常无关
        重写:异常范图可以更小，但是不能跑出新的异常。

* */
public class D3 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.say("aaa");
    }
}

class Person3{
    public void say(){
        System.out.println("锄禾日当午，汗滴禾下土");
    }
}
class Student3 extends Person3{
    public void say(String text){
        System.out.println("床前明月光，玻璃好上霜，要不及时擦，整不好得脏");
    }
}