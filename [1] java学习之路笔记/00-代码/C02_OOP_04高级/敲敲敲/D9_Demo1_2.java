package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 21:10
 **/
//匿名内部类
public class D9_Demo1_2 {
    public static void main(String[] args) {
        D9_Person p = new D9_Person() {
            @Override
            public void say() {
                System.out.println("锄禾日当午165413651");
            }

        };
        hahn(p);
    }



    public static void hahn(D9_Person p){
        p.say();
    }
}
