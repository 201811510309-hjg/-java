package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        //相对路径：以盘符开始   例如c://a.txt
        //绝对路径:java中是相对于项目目录路径    例如  a.txt
        File file1 = new File("c://a.txt");
        File file2 = new File("a.txt");
        System.out.println("File1的路径"+file1.getAbsolutePath());
        System.out.println("File2的路径"+file2.getAbsolutePath());
    }
}
