package D03_核心类库_02常用类库.zy;

/**
 * 3. 字符串压缩:利用字符重复出现的次数，编写一种方法，实现基本的字符串 压缩功能。比如,字符串“aabccdd”会变成“a2b1c2d2”。若“压缩”以后的字符
 * 串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字 母(a-z) 示例 1：输入:aabcccccddddd 输出:a2b1c5d5
 * 示例 2：输入：“abcdd” 输出:“abcdd” 解释:因为压缩后的字符串为:”a1b1c1d2”,长度大于原字符串
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/compress-string-lcci
 */
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //System.out.println(StringDo(str));
        System.out.println(compressString(str));

    }

    public static Object StringDo(String str) {
        int flog = 1;
        StringBuffer str2 = new StringBuffer();//

        if (str.length() <= 2) {
            return str;//输入的str长度小于等于2，一定返回原字符串；
        }

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i - 1) == str.charAt(i)) {
                flog++;//记录字符出现次数
            } else {
                str2.append(str.charAt(i - 1)).append(flog);
                flog = 1;//将字符和出现次数写入；
            }
        }

        str2.append(str.charAt(str.length() - 1)).append(flog);//最后一个字符要自己额外写入，原因略；

        if (str.length() <= str2.length()) {
            return str;
        } else {
            return str2;
        }

    }


    public static String compressString(String S) {
        if (S.length() == 0) { // 空串处理
            return S;
        }
        StringBuffer ans = new StringBuffer();
        int cnt = 1;
        char ch = S.charAt(0);
        for (int i = 1; i < S.length(); ++i) {
            if (ch == S.charAt(i)) {
                cnt++;
            } else {
                ans.append(ch);
                ans.append(cnt);
                ch = S.charAt(i);
                cnt = 1;
            }
        }
        ans.append(ch);
        ans.append(cnt);
        return ans.length() >= S.length() ? S : ans.toString();
    }

}