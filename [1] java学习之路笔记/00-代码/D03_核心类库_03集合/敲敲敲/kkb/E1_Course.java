package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.ArrayList;
import java.util.List;

public class E1_Course {
    private String name;
    private int credit;
    private List<E1_Student> allStudents = null;

    public E1_Course() {
        this.allStudents = new ArrayList<E1_Student>();
    }


    public E1_Course(String name, int credit) {
        this();
        this.name = name;
        this.credit = credit;
    }

    public List<E1_Student> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        return "课程信息：" + "\n" + "\t|- 课程名称：" + this.name + "\n" + "\t|- 课程学分： " + this.credit;
    }
}
