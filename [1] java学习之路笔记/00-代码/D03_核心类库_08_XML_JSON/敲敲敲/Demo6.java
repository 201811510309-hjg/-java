package D03_核心类库_08_XML_JSON.敲敲敲;

import com.thoughtworks.xstream.XStream;
import org.dom4j.DocumentException;
import java.io.IOException;
import java.util.Objects;

public class Demo6 {
    public static void main(String[] args) throws IOException, DocumentException {
        Person person = new Person("张三", 18);
        // XStream的使用
        // 1，创建XStream对象
        XStream xs = new XStream();
        // 2，修改某个类型生成的节点（可选，默认为包名+类名）
        xs.alias("Person", Person.class);
        // 3，传入对象，开始生成
        String xml = xs.toXML(person);
        System.out.println(xml);
    }
    // 创建一个类 用于测试
    static class Person {
        private String name;
        private int age;

        /**
         * 构造方法
         */
        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * getter and setter
         * @return
         */
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

        /**
         * 重写equals和HashCode
         * @param o
         * @return
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        /**
         * 重写toString
         * @return
         */
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}