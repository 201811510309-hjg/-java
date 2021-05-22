package D03_核心类库_03集合.zy.数据结构训练hjg;

//4、分别用 Comparable 和 Comparator 两个接口对下列四位同学的成绩做降序排序，
// 如果成绩一样，那在 成绩排序的基础上按照年龄由小到大排序。

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java基础知识List练习作业_04 {
    public static void main(String[] args) {
        Student s1 = new Student("贾宝玉",14,88.5);
        Student s2 = new Student("林黛玉",13,90.5);
        Student s3 = new Student("史湘云",13,85.5);
        Student s4 = new Student("薛宝钗",15,91.0);
        Student s5 = new Student("工具人",15,88.5);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        System.out.println("--------comparable实现方法--------");
        System.out.println("原来的顺序");
        for(Student s : studentList){
            System.out.println(s);
        }
        System.out.println("--------------"+'\n' + "现在的顺序：");
        Collections.sort(studentList);
        for(Student s : studentList){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("--------comparator实现方法--------");
        System.out.println("原来的顺序");
        for(Student s : studentList){
            System.out.println(s);
        }
        System.out.println("--------------"+'\n' + "现在的顺序：");
        Collections.sort(studentList,new comparator());
        for(Student s : studentList){
            System.out.println(s);
        }
    }

    static class Student implements Comparable<Student>{
        private String name;
        private int age;
        private double points;

        public Student(String name, int age, double points) {
            this.name = name;
            this.age = age;
            this.points = points;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", points=" + points +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            if(o.points == this.points){
                return this.age - o.age;
            }
            if(o.points - this.points > 0){
                return 1;
            }else if(o.points - this.points < 0){
                return -1;
            }else{
                return 0;
            }

        }
    }

    static class comparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.points == o2.points){
                return o1.age - o2.age;
            }
            if(o1.points - o2.points > 0){
                return -1;
            }else if(o1.points - o2.points < 0){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
