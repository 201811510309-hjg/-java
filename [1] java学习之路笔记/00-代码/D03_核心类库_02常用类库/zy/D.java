package D03_核心类库_02常用类库.zy;

/**
 * 4.写一个和 trim 功能相同的方法
 * 思路：
 * 1.定义两个变量，用来存储两个角标
 * 2.分别从头和尾遍历字符串，直到找到第一个不为空格的字符
 * 3.截取字符串
 */
public class D {
    public static void main(String[] args) {

        String s = "    ab   c     ";

        s = myTrim(s);
        //去掉中间的空白地方，不仅仅去掉空格
        //s = s.replaceAll("\\s*", "");
        System.out.println("-" + s + "-");
    }

    public static String myTrim(String s) {

        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }


        while (start <= end && s.charAt(end) == ' ') {
            end--;
        }
        return s.substring(start, end + 1);
    }

}
