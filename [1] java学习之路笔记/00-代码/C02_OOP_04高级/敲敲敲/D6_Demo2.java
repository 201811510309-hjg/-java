package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/30 14:48
 **/

public class D6_Demo2 {
    public static void main(String[] args) {
        D6_Nurse n = new  D6_Nurse();
        D6_Student s = new D6_Student();

        say(s);
    }

    public static void say(D6_Person p){
        //判断某个对象是否是指定类的实例，则可以使用instanceof关键字
        if (p instanceof D6_Student){
            D6_Student s = (D6_Student)p;
            s.say();
        }else{
            System.out.println("错误");
        }


    }
}
