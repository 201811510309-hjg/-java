package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.ArrayList;
import java.util.List;

public class E1_Student {
    private String name;
    private int age;
    private List<E1_Course> allCourses;

    public E1_Student() {
        this.allCourses = new ArrayList<E1_Course>();
    }

    public E1_Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public List<E1_Course> getAllCourses() {
        return allCourses;
    }

    @Override
    public String toString() {
        return "学生信息" + "\n" + "\t|- 姓名：" + this.name + "\n" + "\t|- 年龄：" + this.age;
    }
}
