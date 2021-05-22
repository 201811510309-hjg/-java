package C02_OOP_04高级.敲敲敲;


/**
 * @quther hjg
 * @date 2021/1/31 21:34
 **/
//静态内部类
public class E10_Book {
    private static String name;

    static class Info{
        public void say(){
            System.out.println("扎是一个信息类"+ name);
        }
    }
}
