package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.File;
import java.io.IOException;

public class Demo0 {
    //java.io.*
    //in out
    public static void main(String[] args) throws IOException {
        /*File hah = new File("F://0.txt");
        boolean flag = hah.createNewFile();
        System.out.println(flag?"创建成功":"创建失败");*/

//        File dir = new File("F://haha"); //创建目录
//        dir.mkdir();
//        File dir2 = new File("F://ha/h/a"); //创建多层目录
//        dir2.mkdirs();
        //构造方法
//        File a = new File(dir,"a.txt");
//        a.createNewFile();
//        File b = new File("F://haha","b.txt");
//        b.createNewFile();
//        a.delete();
//        b.delete();

//        file.renameTo(newFile);
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);



    }
}
