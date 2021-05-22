package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 14:53
 **/
/**
 * class 类名{
 * 	成员属性;
 * 	成员方法;
 * }
 *
 * 类必须编写在。java文件中，。
 * 一个.java文件中， 可以存在N个类， 但是只能存在一个public修饰的类。
 * 。java文件的文件名称 必须 与public修饰的类名 完全一致；
 *
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象的格式：
        //类名 对象名 = new 类名();
        Person p = new Person();
        //对象属性赋值
        //格式：	对象名.属性名=值;
        p.name = "张三";
        p.age = 18;
        p.sex = '男';
        p.say();

        int s = p.sum(100,200);
        System.out.println(s);

    }
}
/**
 * 类就像是图纸
 */
class Person{
    //属性 - 特征
    String name;
    int age;
    char sex;
    //方法 - 行为
    /**
     * 定义格式：
     * 返回值类型 方法名称(形式参数列表){
     * 	方法体
     * 	return 返回值;
     * }
     *
     * 调用格式：
     * 对象名.方法名称(实际参数列表);
     */

    void say() {
        System.out.println("自我介绍：我是"+name+" , 我的年龄："+age+"，我的性别："+sex);
    }

    int sum(int x,int y) {
        int z = x+y;
        return z;
    }

    /*
	void xxx() {
		if(true) {
			return;  //结束的地方
		}
		System.out.println("哈哈");
	}
	*/



}

