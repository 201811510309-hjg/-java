package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;


public class Demo13 {
    public static void main(String[] args) throws IOException {
        //properties文件与properties类
        /*Properties pt = new Properties();
        //键=值
        pt.put("name","金苹果");
        pt.put("info","讲述历了金苹果种植的过程");
        FileWriter fw = new FileWriter("c://book.properties");
        pt.store(fw,"存储的图书");
        fw.close();*/

        Properties pt = new Properties();
        Reader fw = new FileReader("c：//book.properties");
        pt.load(fw);
        System.out.println("name");
        System.out.println("info");
    }
}
