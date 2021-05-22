package C02_OOP_04高级.zy.test_questions2;

public class main {
    public static void main(String[] args) {
        MyList my = new MyList();
        my.add("hjg");
        my.add("2");
        my.add("3");
        my.add("4");
        my.add("5");
        Integer b = 996;
        my.add(b);
        my.add("7");
        my.add("8");
        my.add("9");
        Integer a = new Integer(10);
        my.add(a);

        //测试下标超出范围的情况
        my.remove(30);
        //测试数据错误的情况
        my.remove("1024");
        //测试找到数据的情况
        my.remove("hjg");

        //测试返回给定下标对应的值
        System.out.println(my.get(2));
        //下标不正确
        System.out.println(my.get(9));
    }
}
