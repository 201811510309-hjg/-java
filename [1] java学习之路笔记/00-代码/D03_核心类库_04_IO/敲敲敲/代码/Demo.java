package D03_核心类库_04_IO.敲敲敲.代码;


import java.io.FileNotFoundException;

/**
 * @author liweijie
 */
public class Demo {
    /**
     * IO流概述
     *  可以将这种数据传输操作,看做一种数据的流动 , 按照流动的方向分为输入Input和输出Output
     *  Java中的IO操作主要指的是 java.io包下的一些常用类的使用. 通过这些常用类对数据进行读取(输入Input) 和 写出(输出Output)
     *
     * IO流的分类:
     *  按照流的方向来分,可以分为:输入流和输出流.
     *  按照流动的数据类型来分,可以分为:字节流和字符流
     *
     *     字节流:
     *          -   输入流 :   InputStream
     *          -   输出流 :   OutputStream
     *     字符流:
     *          -   输入流 :   Reader
     *          -   输出流 :   Writer
     *
     *
     * 一切皆字节:
     *      计算机中的任何数据(文本,图片,视频,音乐等等)都是以二进制的形式存储的.
     *      在数据传输时 也都是以二进制的形式存储的.
     *      后续学习的任何流 , 在传输时底层都是二进制.
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {


    }

}
