package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 21:10
 **/
//局部内部类
public class D9_Demo1 {
    public static void main(String[] args) {
        int a=10;  //局部内部类只能访问final型的局部变量

        int finalA = a;
        class PersonImp implements D9_Person{
            @Override
            public void say() {
                System.out.println("新编写的局部内部类的say方法内容"+ finalA);
            }
        }
        a=20;
        PersonImp p = new PersonImp();
        hahn(p);
    }

    public static void hahn(D9_Person p){
        p.say();
    }
}
