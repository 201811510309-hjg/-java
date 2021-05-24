package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.*;

//使用了装饰者模式

public class Demo11 {
    public static void main(String[] args) throws IOException {
        //转换流  ：将字节流转换成字符流     使用了装饰者模式
        FileInputStream fis = new FileInputStream("c://a.txt");
        //将字节输入流转换为字符输入流  参数为要转换的字节流
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        while (true){
            int c = isr.read();
            if(c==-1){
                break;
            }
            System.out.println((char) c);
        }

        FileOutputStream fos = new FileOutputStream("c://a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos); //文件上传 ...
        osw.write("床前明月光");
        osw.flush();
        osw.close();
    }
}
