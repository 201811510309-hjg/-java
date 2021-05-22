package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.Iterator;

public class E0_TestDemo {
    public static void main(String[] args) {
        E0_Student stu1 = new E0_Student("张三",10);
        E0_Student stu2 = new E0_Student("李四",11);
        E0_Student stu3 = new E0_Student("王五",13);

        E0_School sch = new E0_School("LAMP JAVA");
        sch.getAllStudents().add(stu1); // 一个学校有多个学生
        stu1.setSchool(sch);// 一个学生属于一个学校
        sch.getAllStudents().add(stu2); // 一个学校有多个学生
        stu2.setSchool(sch);// 一个学生属于一个学校
        sch.getAllStudents().add(stu2); // 一个学校有多个学生
        stu3.setSchool(sch);// 一个学生属于一个学校
        System.out.println(sch);
        Iterator<E0_Student> iter = sch.getAllStudents().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(stu1.getSchool());
    }
}
