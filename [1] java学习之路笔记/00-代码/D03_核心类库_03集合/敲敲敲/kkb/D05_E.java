package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.Enumeration;
import java.util.Vector;

public class D05_E {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("A");
        v.add("B");
        v.add("C");
        Enumeration<String> enu = v.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
