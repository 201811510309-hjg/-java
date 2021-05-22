package 问题解决;

import java.util.ArrayList;
import java.util.List;

/*
括号内的智力题  插入括号
*/

public class a004 {
    public static void main(String[] args) {

        System.out.println((2 * 3) + 4 * 5 + (6 * 7));
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.diffWaysToCompute("2*3+4*5+6*7"));



    }
}

class Solution1 {
    char[] cArr;
    int len;
    List<Integer> res = new ArrayList<Integer>();

    public List<Integer> diffWaysToCompute(String input) {
        this.cArr = input.toCharArray();
        this.len = input.length();
        return dfsHelper(0, len - 1);
    }

    private List<Integer> dfsHelper(int l, int r) {
        int idx = l, num = cArr[idx] - '0';
        List<Integer> nArr = new ArrayList<Integer>();
        while ((idx + 1 <= r) && Character.isDigit(cArr[idx + 1])) {
            idx++;
            num = num * 10 + (cArr[idx] - '0');
        }
        if (idx == r) {nArr.add(num); return nArr;}
        for (int i = idx + 1; i <= r; i++) {
            if (Character.isDigit(cArr[i])) continue;
            List<Integer> left = this.dfsHelper(l, i - 1);
            List<Integer> right = this.dfsHelper(i + 1, r);
            for (int val_l : left) {
                for (int val_r : right) {
                    char opt = cArr[i]; int output = 0;
                    if (opt == '+') output = val_l + val_r;
                    else if (opt == '-') output = val_l - val_r;
                    else if (opt == '*') output = val_l * val_r;
                    nArr.add(output);
                }
            }
        }
        return nArr;
    }
}

