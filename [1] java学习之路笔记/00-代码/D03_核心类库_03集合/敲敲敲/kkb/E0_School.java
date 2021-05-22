package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.ArrayList;
import java.util.List;

public class E0_School {
    private String name;
    private List<E0_Student> allStudents = null;
    public E0_School(){
        this.allStudents = new ArrayList<E0_Student>();
    }

    public E0_School(String name) {
        this();
        this.name = name;
    }

    public List<E0_Student> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        return "学校信息：" + "\n" + "\t|- 学校名称：" + this.name;
    }
}
