package D03_核心类库_02常用类库.敲敲敲.kkb;

import java.math.BigDecimal;

public class D6_BigDecimal {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal b3 = b1.add(b2);  //接收 原来的没变


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        double v = b3.intValue();
        System.out.println(v);
    }
}
