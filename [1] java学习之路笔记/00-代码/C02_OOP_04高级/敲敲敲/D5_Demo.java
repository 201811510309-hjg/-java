package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/29 23:32
 **/
//抽象类
public class D5_Demo {
    public static void main(String[] args) {
//        D5_Student s = new D5_Student();
//        s.say();
//        D5_Nurse n = new D5_Nurse();
//        n.say();
        //多态
//        D5_Person p = null; //p
//        D5_Student s = new D5_Student(); //s
//        p = s;
//        p.say();

        D5_Student a = new D5_Student();
        D5_Nurse b = new D5_Nurse();
        D5_Person p1 = a;
        D5_Person p2 = b;

        p1.say();
        p2.say();

        D5_Student a2 = (D5_Student)p1;
        D5_Student a3 = (D5_Student)p2;
        a2.say();
        a3.say();

    }
}
