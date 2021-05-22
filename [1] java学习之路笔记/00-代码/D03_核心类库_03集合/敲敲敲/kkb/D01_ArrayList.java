package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.ArrayList;
import java.util.List;

public class D01_ArrayList {
    public static void main(String[] args) {
        //ArrayList   :    使用数组结构，对于增加删除慢。查找快
        ArrayList<Integer> data = new ArrayList<>();
        data.add(100);
        data.add(22);
        System.out.println(data.get(0));

//范例：增加及取得元素
        List<String> all = new ArrayList<String>(); // 实例化List对象，并指定泛型类型
        all.add("hello ");                          // 增加内容，此方法从Collection接口继承而来
        all.add(0, "LAMP ");          // 增加内容，此方法是List接口单独定义的
        all.add(1,"world");           // 增加内容，此方法从Collection接口继承而来
        System.out.println(all);                    // 打印all对象调用toString()方法
    }
}
