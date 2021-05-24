package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo7 {
    //InputStream
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c://a.txt");
        /*while (true){
            byte b = (byte) fis.read();
            if(b==-1){
                break;
            }
            System.out.println((chat)b);
        }*/
        byte[] bytes = new byte[10];
        int len = fis.read(bytes);  //注意误区
        System.out.println(new String(bytes,0,len));
        len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));
        len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));

        len = fis.read(bytes); //文件下载器  一次读一组
        System.out.println(len);
        fis.close();
    }
}
