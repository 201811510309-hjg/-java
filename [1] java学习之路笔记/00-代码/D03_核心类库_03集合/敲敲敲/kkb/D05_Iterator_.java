package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class D05_Iterator_ {
    public static void main(String[] args) {
        Collection<String> all = new ArrayList<String>();
        all.add("A"); all.add("B");
        all.add("C"); all.add("D");
        all.add("E");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()) {
            // 判断是否有下一个元素
            String str = iter.next();
            // 取出当前元素
            if (str.equals("C")) {
                all.remove(str); // 错误的，调用了集合中的删除
            } else {
                System.out.print(str + "、");
            }
        }
    }
}
