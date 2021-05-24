package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.*;

/**
 * Print 与 BufferedReader
  */

public class Demo11_1 {
    public static void main(String[] args) throws IOException {
        //字符输出（打印流）Print
        /*PrintStream ps = new PrintStream("f://f.txt");
        ps.println("锄禾日当午");
        ps.println("汗滴禾下土");
        ps.println("谁知盘中餐");
        ps.println("粒粒皆辛苦");*/

        /*PrintWriter pw = new PrintWriter("f://f.txt");
        pw.println("锄禾日当午");
        pw.println("汗滴禾下土");
        pw.println("谁知盘中餐");
        pw.println("粒粒皆辛苦");
        pw.flush();*/

        /*FileOutputStream fos = new FileOutputStream("f://f.txt");
        PrintWriter pw = new PrintWriter(fos);
        pw.println("锄禾日当午");
        pw.println("汗滴禾下土");
        pw.println("谁知盘中餐");
        pw.println("粒粒皆辛苦");
        pw.flush();*/

        // 缓存读取流 ， 将字符输入流 转换为带有缓存 可以一次读取一行的缓存字符读取流
        FileReader fw = new FileReader("f://f.txt");
        BufferedReader br = new BufferedReader(fw);
        String text = br.readLine();
        System.out.println(text);

    }
}
