package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/30 15:33
 **/

public class D7_Person {
    private String name;
    private int age;

    public D7_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public D7_Person() {
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
        return "这是一个人，这个人的名字是："+this.name+"  他的年龄是"+this.age;


//        return "D7_Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }

    @Override
    public boolean equals(Object o) {

//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;  //getClass  反射知识
//        D7_Person d7_person = (D7_Person) o;
//        return age == d7_person.age &&
//                name.equals(d7_person.name);

        if (this == o){
            return true;
        }
        if (o == null){
            return false;
        }
        if (o instanceof D7_Person){
            D7_Person p2 = (D7_Person) o;
            if (this.name.equals(p2.name) && this.age == p2.age){
                //相同
                return true;
            }
        }
//        else {
//            return false;
//        }
        return false;

    }

}
