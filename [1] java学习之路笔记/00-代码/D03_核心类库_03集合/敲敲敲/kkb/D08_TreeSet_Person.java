package D03_核心类库_03集合.敲敲敲.kkb;

public class D08_TreeSet_Person implements Comparable<D08_TreeSet_Person>{
    private String name;
    private int age;

    @Override
    public int compareTo(D08_TreeSet_Person per) {
        if (this.age > per.age) {
            return 1;
        } else if (this.age < per.age) {
            return -1;
        } else {
            return this.name.compareTo(per.name);
        }
    }

    public D08_TreeSet_Person() {
    }

    public D08_TreeSet_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
         return "姓名：" + this.name + "，年龄：" + this.age;
    }
}
