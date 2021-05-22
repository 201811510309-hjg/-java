package 问题解决;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//一维跳棋
public class a005 {
    public static void main(String[] args) {
        Node node = new Node();
    }

    static class Node {
        String start = "";
        String end = "";
        int N = 0;
        int result = -1;
        int count = 0;

        public Node() {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                start += "W";
                end += "B";
            }
            start += ".";
            end += ".";
            for (int i = 0; i < N; i++) {
                start += "B";
                start += "B";
                end += "W";
            }

            Queue<String> process = new LinkedList<String>();
            HashMap<String, String> memery = new HashMap<String, String>(5000);
            process.offer(start);
            memery.put(start, "");
            while (result == -1) {
                String cur = process.poll();
                int tmp = 0;//空格坐标
                while (cur.charAt(tmp) != '.') {
                    tmp++;
                }

                int d[] = {-1, 1, -2, 2};
                for (int i = 0; i < 4; i++) {
                    int n = tmp + d[i];//被换的坐标
                    if (tmp >= 0 && tmp <= 2 * N && n >= 0&& n <= 2 * N) {
                        String chang = cur;
                        char c = chang.charAt(n);
                        chang = chang.replace('.', c);
                        StringBuilder strBuilder = new StringBuilder(chang);
                        strBuilder.setCharAt(n, '.');
                        chang = strBuilder.toString();
                        if (chang.equals(end)) {
                            chang = strBuilder.toString();
                            if (chang.equals(end)) {
                                result = 1;
                                memery.put(chang, memery.get(cur) + (n + 1));
                            }
                            if (!memery.containsKey(chang)) {
                                memery.put(chang, memery.get(cur) + (n + 1));
                                process.offer(chang);
                            }
                        }
                    }
                }
                String sum = memery.get(end);
                for (int i = 0; i < sum.length(); i++) {
                    if (i % 5 == 0) {
                        System.out.println();
                    }
                    System.out.println(sum.charAt(i) + " ");
                }
            }
        }
    }
}