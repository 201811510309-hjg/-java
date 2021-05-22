package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.*;

public class D09_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三A");
        map.put(2, "李四");
        map.put(3, "王五");
        Set<Integer> set = map.keySet(); // 得到全部的key
        Collection<String> value = map.values(); // 得到全部的value
        Iterator<Integer> iter1 = set.iterator();
        Iterator<String> iter2 = value.iterator();
        System.out.print("全部的key：");
        while (iter1.hasNext()) {
            System.out.print(iter1.next() + "、");
        }
        System.out.print("\n全部的value：");
        while (iter2.hasNext()) {
            System.out.print(iter2.next() + "、");
        }
    }
}
