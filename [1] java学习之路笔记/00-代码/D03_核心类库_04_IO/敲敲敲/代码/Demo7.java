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
            System.out.println(b);
        }*/
        byte[] bytes = new byte[10];
        int len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));
        len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));
        len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));
        fis.close();
    }
}
