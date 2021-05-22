package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.HashSet;
import java.util.Set;

public class D06_set4 {
    public static void main(String[] args) {
        Set<String> all = new HashSet<String>(); // 实例化Set接口对象
        all.add("A"); all.add("B"); all.add("C"); all.add("D"); all.add("E");
        String[] str = all.toArray(new String[] {});// 变为指定的泛型类型数组
        for (int x = 0; x < str.length; x++) {
            System.out.print(str[x] + "、");
        }
    }
}
