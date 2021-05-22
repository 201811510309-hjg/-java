package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileOutputStream;
import java.io.IOException;


public class Demo6 {

    //IO流    可以把数据传输的操作看作是数据的流动，分为输入Input和输出Output
    //java的IO操作就是java.io包下的一些常用类的使用，通过这些常用类对数据进行读取和写出
    //硬件-》java运行内存-》目标地址

    //IO流的分类    通过流的方向可以分为：输入流和输出流
    //按照流动的数据类型分为：字节流  字符流
    //字节流：输入流   InputStream
    //       输出流   outputStream
    //字符流：输入流  Reader   字符流也是字节流
    //       输出流  Write

    //一切皆字节
    public static void main(String[] args) throws IOException {
        //OutputStream
        FileOutputStream fos = new FileOutputStream("c://a.txt");
        /*byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);*/
        //byte[] bytes2 = {65,66,67,68,69};
        byte[] bytes2 = "ABCDEF".getBytes();
        fos.write(bytes2,2,2);
        //fos.write(bytes2);
        fos.close();                //写在哪在哪关闭
        System.out.println("已经写出");

    }
}
