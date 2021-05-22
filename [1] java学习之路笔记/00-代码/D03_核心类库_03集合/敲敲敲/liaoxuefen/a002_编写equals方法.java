package D03_核心类库_03集合.敲敲敲.liaoxuefen;

/*public class a002_编写equals方法 {
    public static void main(String[] args) {
        *//*List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains("C")); // true
        System.out.println(list.contains("X")); // false
        System.out.println(list.indexOf("C")); // 2
        System.out.println(list.indexOf("X")); // -1

        System.out.println(list.contains(new String("C"))); // true or false?
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?*//*
        List<Person> list = List.of(
                new Person("Xiao Ming"),
                new Person("Xiao Hong"),
                new Person("Bob")
        );
        System.out.println(list.contains(new Person("Bob"))); // false
        *//**
         * 不出意外，虽然放入了new Person("Bob")，但是用另一个new Person("Bob")查询不到，原因就是Person类没有覆写equals()方法。
         *//*
    }

    *//*public class ArrayList {
        Object[] elementData;
        public boolean contains(Object o) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return true;
                }
            }
            return false;
        }
    }*//*



}
class Person {
    String name;
    public int age;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        *//*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);*//*


        *//*if (o instanceof Person) {
            Person p = (Person) o;
            return this.name.equals(p.name) && this.age == p.age;
        }
        return false;*//*
*/



/**
 * 对于引用字段比较，我们使用equals()，对于基本类型字段的比较，我们使用==。
 * 如果Person有好几个引用类型的字段，上面的写法就太复杂了。要简化引用类型的比较，
 * 我们使用Objects.equals()静态方法：
 *//*
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}*/


import java.util.List;
import java.util.Objects;
public class a002_编写equals方法 {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Xiao", "Ming", 18),
                new Person("Xiao", "Hong", 25),
                new Person("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);

        if (o instanceof Person){
            Person p = (Person) o;
            return Objects.equals(this.firstName,p.firstName) &&Objects.equals(this.lastName,p.lastName) && this.age == p.age;
        }
        return false;


    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
