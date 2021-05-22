package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.Iterator;

public class E1_TestDemo {
    public static void main(String[] args) {
        E1_Student stu1 = new E1_Student("张三", 10);
        E1_Student stu2 = new E1_Student("李四", 11);
        E1_Student stu3 = new E1_Student("王五", 12);
        E1_Student stu4 = new E1_Student("赵六", 15);
        E1_Student stu5 = new E1_Student("孙七", 13);

        E1_Course c1 = new E1_Course("Oracle", 5);
        E1_Course c2 = new E1_Course("JavaSE基础课程", 10);

        c1.getAllStudents().add(stu1); // 参加第一门课程
        c1.getAllStudents().add(stu2); // 参加第一门课程
        stu1.getAllCourses().add(c1); // 学生选择课程
        stu2.getAllCourses().add(c1); // 学生选择课程

        c2.getAllStudents().add(stu1); // 参加第二门课程
        c2.getAllStudents().add(stu2); // 参加第二门课程
        c2.getAllStudents().add(stu3); // 参加第二门课程
        c2.getAllStudents().add(stu4); // 参加第二门课程
        c2.getAllStudents().add(stu5); // 参加第二门课程

        stu1.getAllCourses().add(c2); // 学生选择课程
        stu2.getAllCourses().add(c2); // 学生选择课程
        stu3.getAllCourses().add(c2); // 学生选择课程
        stu4.getAllCourses().add(c2); // 学生选择课程
        stu5.getAllCourses().add(c2); // 学生选择课程
        System.out.println(c2);
        Iterator<E1_Student> iter = c2.getAllStudents().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("----------------------------");
        System.out.println(stu1);
        Iterator<E1_Course> iters = stu1.getAllCourses().iterator() ;
        while (iters.hasNext()) {
            System.out.println(iters.next());
        }
    }
}
