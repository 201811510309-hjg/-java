package D03_核心类库_09枚举_注解_反射.敲敲敲;

public class Memo2 {
    @Override
    public String toString() {  //IDEA实时编译
        return super.toString();
    }

    public static void main(String[] args) {
        Person p = new Person();
    }




}

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    /**
     * 废弃  可以通过setAge2 来完成任务
     * @param age
     */
    @Deprecated
    public void setAge(int age) {
        this.age = age;
    }

    private void setAge2(){
        if(age<0||age>150){
            throw new RuntimeException("年龄不合理");
        }
        this.age = age;
    }


}