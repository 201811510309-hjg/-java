package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.ArrayList;
import java.util.List;

public class D02_ArrayList {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>(); // 实例化List对象，并指定泛型类型
        all.add("hello");   // 增加内容，此方法从Collection接口继承而来
        all.add(0,"Lamp");  // 增加内容，此方法是List接口单独定义的
        all.add("world");
        System.out.println(all);    // 打印all对象调用toString()方法

        all.remove(1); // 根据索引删除内容，此方法是List接口单独定义的
        all.remove("world"); // 删除指定的对象
        System.out.print("List 集合中的内容是：");
        for (int x = 0;x < all.size();x++){
            System.out.println(all.get(x) + " 、");
        }
    }
}
