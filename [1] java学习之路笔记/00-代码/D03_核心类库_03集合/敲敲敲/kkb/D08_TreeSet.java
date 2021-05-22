package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.Set;
import java.util.TreeSet;

public class D08_TreeSet {
    public static void main(String[] args) {
        // 实例化Set接口对象
        Set<String> all = new TreeSet<String>();
        all.add("D");
        all.add("X");
        all.add("A");
        System.out.println(all);
    }
}
