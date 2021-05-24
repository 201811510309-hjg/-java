package D03_核心类库_04_IO.敲敲敲.hjg_lxf;

import java.io.File;
import java.io.IOException;

public class a001 {
    public static void main(String[] args) throws IOException {
        /**
         * IO流是一种流式的数据输入/输出模型：
         *
         * 二进制数据以byte为最小单位在InputStream/OutputStream中单向流动；
         *
         * 字符数据以char为最小单位在Reader/Writer中单向流动。
         *
         * Java标准库的java.io包提供了同步IO功能：
         *
         * 字节流接口：InputStream/OutputStream；
         *
         * 字符流接口：Reader/Writer。
         */
        File f = new File("..");
        System.out.println(f.getPath()); //返回构造方法传入的路径
        System.out.println(f.getAbsolutePath()); //返回绝对路径
        System.out.println(f.getCanonicalPath()); //它和绝对路径类似，但是返回的是规范路径
        System.out.println(File.separator); // 根据当前平台打印"\"或"/"
    }
}
