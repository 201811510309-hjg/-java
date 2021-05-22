package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.HashSet;
import java.util.Set;

public class D06_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(); // 实例化Set接口对象
        //添加元素
        set.add(new String("123")); set.add("123"); set.add("123"); set.add("321");
        //遍历
        for (String name : set) { System.out.println(name); }
    }
}
