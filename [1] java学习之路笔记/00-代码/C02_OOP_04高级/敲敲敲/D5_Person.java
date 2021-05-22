package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/30 10:58
 **/

public abstract  class D5_Person {
    public D5_Person() {
        System.out.println("构造方法执行了");
    }

    int age;
    public abstract void say();
}
