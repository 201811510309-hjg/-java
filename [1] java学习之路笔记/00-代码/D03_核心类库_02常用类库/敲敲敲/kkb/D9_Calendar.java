package D03_核心类库_02常用类库.敲敲敲.kkb;

import java.util.Calendar;

public class D9_Calendar {
    // set
    // get
    // add
    // getTime  :   获取日历时间 表示的Data对象
    //getActualMaxmun : 获取某字段的最大值
    public static void main(String[] args) {
        //Calendar
        Calendar c1 =  Calendar.getInstance();
//        c1.set(Calendar.YEAR,2021);
//        int year = c1.get(Calendar.YEAR);
//        int day = c1.get(Calendar.DAY_OF_YEAR);
//        int weak =  c1.get(Calendar.WEDNESDAY);
//        System.out.println();
//        System.out.println(year);
//        System.out.println(day);
//        System.out.println(weak);

//        c1.add(Calendar.MONTH,-1);
//        System.out.println(c1.get(Calendar.MONTH));
//        Date d = c1.getTime();
//        System.out.println(d);

        c1.set(Calendar.MONTH,2);
        int m = c1.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(m);
    }
}
