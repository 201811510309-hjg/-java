package D03_核心类库_03集合.zy.数据结构训练;


//4、分别用 Comparable 和 Comparator 两个接口对下列四位同学的成绩做降序排序，
// 如果成绩一样，那在 成绩排序的基础上按照年龄由小到大排序。 ??????????


import java.util.LinkedList;

public class Java基础知识List练习作业_04 {

    public static void main(String[] args) {
        String[] info = { "贾宝玉 14 88.5f", "林黛玉 13 90.5f", "史湘云 13 85f", "薛宝钗 15 91f" };
        SSSS[] stus = new SSSS[4];
        LinkedList<SSSS> list = new LinkedList<SSSS>();
        for (int i = 0; i < 4; i++) {
            String[] inf = info[i].split(" ");  //分割
            String name = inf[0];
            int age = Integer.parseInt(inf[1]);
            float grade = Float.parseFloat(inf[2]);

            stus[i] = new SSSS(name, age, grade);
            list.add(stus[i]);
        }

        System.out.println("原信息：");
        for (SSSS stu : list)
            stu.printy();

        sort(list);

        System.out.println("排序后：");
        for (SSSS stu : list)
            stu.printy();
    }

    private static void sort(LinkedList<SSSS> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                float flag = list.get(j).grade - (list.get(j + 1).grade);
                if (flag < 0) {
                    SSSS temp = list.get(j + 1);  //完成替换
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);

                } else if (flag == 0) {
                    boolean nf = list.get(j).age > (list.get(j + 1).age);
                    if (nf) {

                        SSSS temp1 = list.get(j + 1);
                        list.set(j + 1, list.get(j));
                        list.set(j, temp1);
                    }
                }
            }
        }
    }

}

class SSSS {
    String name;
    int age;
    float grade;

    public SSSS(String name, int age, float grade) {
        super();
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printy() {
        System.out.println("姓名：" + name + "\t年龄: " + age + "\t成绩: \t" + grade);
    }
}

