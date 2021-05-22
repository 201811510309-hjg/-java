package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.HashSet;
import java.util.Set;

public class D06_set5 {
    public static void main(String[] args) {
        Set<String> all = new HashSet<String>(); // 实例化Set接口对象
        all.add("A");
        all.add("A");
        all.add("A");
        all.add("A");
        all.add("A");
        all.add("A");
        all.add("B");
        all.add("C");
        all.add("D");
        all.add("E");
        System.out.println(all);
    }
}
