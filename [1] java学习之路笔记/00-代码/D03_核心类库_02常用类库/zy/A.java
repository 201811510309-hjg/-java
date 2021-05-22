package D03_核心类库_02常用类库.zy;

/**
 * 1.编写一个方法，将一段文本中的各个单词的字母顺序翻转，
 * 例如："I like writing code best"，将变成"I ekil gnitirw edoc tseb"。
 */
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(reverse1(s));
//        System.out.println(s);

    }
    // StringBuffer
    public static StringBuffer reverse1(String s) {
        String[] ss = s.split(" ");
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < ss.length; i++) {
            StringBuffer sb = new StringBuffer(ss[i]);
            sb.reverse(); //反转
            //System.out.println(sb);
            sb2.append(sb);
            if (i == ss.length - 1) {
                sb2.append(".");
            } else {
                sb2.append(" ");
            }
        }
        return sb2;
    }
}
