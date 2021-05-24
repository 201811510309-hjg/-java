package D03_核心类库_04_IO.敲敲敲.代码.aa1.test;

import D03_核心类库_04_IO.敲敲敲.代码.aa1.pojo.Student;
import D03_核心类库_04_IO.敲敲敲.代码.aa1.util.MySerializeUtil;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<String> teacherList=new ArrayList<>();
        teacherList.add("空空道人");
        teacherList.add("贾代儒");
        Student stu1=new Student("1001", "贾宝玉", teacherList);
        System.out.println("原始对象："+stu1);

        String fileName="stu01.txt";
        try{
            //对象 序列化
            MySerializeUtil.mySerialize(stu1,fileName);
            System.out.println("序列化原始对象完成！OK！");
            //对象 反序列化
            Object obj= MySerializeUtil.myDeserialize(fileName);
            if(obj instanceof Student){
                Student stuNew= (Student) obj;
                System.out.println("反序列化之后的对象："+stuNew);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
