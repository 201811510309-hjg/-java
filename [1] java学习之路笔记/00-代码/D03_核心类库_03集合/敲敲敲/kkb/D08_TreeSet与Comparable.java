package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.Set;
import java.util.TreeSet;

public class D08_TreeSet与Comparable {
    public static void main(String[] args) {
        Set<D08_TreeSet_Person> all = new TreeSet<D08_TreeSet_Person>();
        all.add(new D08_TreeSet_Person("张三", 10));
        all.add(new D08_TreeSet_Person("李四", 10));
        all.add(new D08_TreeSet_Person("王五", 11));
        all.add(new D08_TreeSet_Person("赵六", 12));
        all.add(new D08_TreeSet_Person("孙七", 13));
        System.out.println(all);
    }
}
