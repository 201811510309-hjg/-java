package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/30 14:00
 **/
//接口
public class D6_Demo {
    public static void main(String[] args) {
//        D6_Student s = new D6_Student();
//        s.say();

        //多态
        D6_Student s = new D6_Student();
        say(s);
        D6_Nurse n =new D6_Nurse();
        say(n);
    }

    public static void say(D6_Person p){   //eg 数据库不确定的时候用
        p.say();
    }

}
