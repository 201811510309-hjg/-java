package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D09_Map2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("ZS", "张三");
        map.put("LS", "李四");
        map.put("WW", "王五");
        map.put("ZL", "赵六");
        map.put("SQ", "孙七");
        Set<String> set = map.keySet();// 得到全部的key
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String i = iter.next();
            // 得到key
            System.out.println(i + " --:> " + map.get(i));
        }
    }
}
