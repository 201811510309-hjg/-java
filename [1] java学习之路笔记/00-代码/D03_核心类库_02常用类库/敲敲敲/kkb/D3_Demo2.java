package D03_核心类库_02常用类库.敲敲敲.kkb;

import java.util.Objects;

public class D3_Demo2 {
    public static void main(String[] args) {
//        String s1 = null;
//        String s2 = "456";
//        System.out.println(s1.equals(s2));

        D3_Person p1 = null;
        D3_Person p2 = new D3_Person();
//        System.out.println(p1.equals(p2));
//        System.out.println(Objects.equals(p1,p2));
//        System.out.println(Objects.isNull(p1));
        System.out.println(Objects.requireNonNull(p1));

    }
}
