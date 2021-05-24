package D03_核心类库_04_IO.敲敲敲.代码.aa1.pojo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/*** 学生实体类 */
public class Student implements Serializable {
    private String stuNum; //学号
    public  String stuName; //姓名
    private List<String> teacherlist; //教师姓名：一个学生可以有多个老师

    private void writeObject(ObjectOutputStream objOut) throws IOException {
        System.out.println("writeObject-----------");
        objOut.writeObject(stuNum);
        objOut.writeObject(stuName);
    }

    private void readObject(ObjectInputStream objIn) throws IOException, ClassNotFoundException {
        System.out.println("readObject-----------");
        stuNum= (String) objIn.readObject();
        stuName= (String) objIn.readObject();
    }


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
}
