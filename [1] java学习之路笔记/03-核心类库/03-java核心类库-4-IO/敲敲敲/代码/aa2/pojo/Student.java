package D03_核心类库_04_IO.敲敲敲.代码.aa2.pojo;

import java.io.*;
import java.util.List;

/*** 学生实体类 */
public class Student implements Externalizable {
    private String stuNum; //学号
    public  String stuName; //姓名
    private List<String> teacherlist; //教师姓名：一个学生可以有多个老师

    public Student() { //无参数构造方法
    }
    //全参构造方法
    public Student(String stuNum, String stuName, List<String> teacherlist) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.teacherlist = teacherlist;
    }
    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", teacherlist=" + teacherlist +
                '}';
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public List<String> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(List<String> teacherlist) {
        this.teacherlist = teacherlist;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(stuNum);
        out.writeObject(stuName);
        //out.writeObject(teacherList);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        stuNum= (String) in.readObject();
        stuName= (String) in.readObject();
        //teacherList= (List<String>) in.readObject();
    }
}
