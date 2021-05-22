package D03_核心类库_02常用类库.敲敲敲.kkb;
//泛型类
public class D1_Person<A> {
    private String name;
    private int age;
    private A data;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public A getData() {
        return data;
    }
    public void setData(A data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "D1_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", data=" + data +
                '}';
    }
}
