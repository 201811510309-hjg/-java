package D03_核心类库_02常用类库.敲敲敲.kkb;

import java.util.Date;

public class D7_Date {
    public static void main(String[] args) {
        //创建一个当前时间的Data
        Date d = new Date();
        System.out.println(d.getTime());

        System.out.println(d.toString());
    }
}
