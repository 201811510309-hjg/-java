package D03_核心类库_03集合.敲敲敲.kkb;

public class E0_Student {
    private String name;
    private int age;
    private E0_School school;

    public E0_School getSchool() {
        return school;
    }

    public void setSchool(E0_School school) {
        this.school = school;
    }

    public E0_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "学生信息" + "\n" + "\t|- 姓名：" + this.name + "\n" + "\t|- 年龄：" + this.age;
    }
}
