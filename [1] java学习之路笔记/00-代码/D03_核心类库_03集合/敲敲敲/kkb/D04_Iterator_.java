package D03_核心类库_03集合.敲敲敲.kkb;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Iterator与ListIterator
public class D04_Iterator_ {
    public static void main(String[] args) {
        Collection<String> all = new ArrayList<String>();
        all.add("A"); all.add("B"); all.add("C"); all.add("D"); all.add("E");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()) {
            // 判断是否有下一个元素
            String str = iter.next();
            // 取出当前元素
            System.out.print(str + "、");
        }
    }
}
