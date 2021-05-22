package D03_核心类库_02常用类库.zy;

/**
 *2. String s="name=王五 age=18 classNum=1101”;
 * 将上面的字符串中包含的信息存放到 Student（里面有 name，age， classNum 三个属性）的对象中
 *
 */

public class B {
    public static void main(String[] args) {
        String s = "name=王五 age=18 classNum=1101";
        //1. 将字符串切割
        String []ss = s.split(" ");//2.定义一个新的字符接收结果
        String data[] = new String[3];
        //3. 使用for循环遍历字符数组获取每一个元素
        for (int i = 0; i < ss.length; i++) {
            //4. 获取等号后面的每一个下标
            int index = ss[i].indexOf("=")+1;  //根据角标值获得对应的元素
            //System.out.println(index);
            data[i] = ss[i].substring(index);
        }

        Student 王五 = new Student(data[0],data[1],data[2]);
        System.out.println("王五的信息: "+王五.getName()+" "+王五.getAge()+" "+王五.getClassNum());

    }
}

class Student{
    private String name;
    private String age;
    private String classNum;

    public Student() {
    }

    public Student(String name, String age, String classNum) {
        this.name = name;
        this.age = age;
        this.classNum = classNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getClassNum() {
        return classNum;
    }
}