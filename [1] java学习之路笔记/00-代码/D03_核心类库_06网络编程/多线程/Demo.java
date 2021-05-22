package D03_核心类库_06网络编程.多线程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {
    /**
     * TCP协议的网络编程
     * 服务器
     * @param args
     */


    public static void main(String[] args) throws IOException {
        //服务器
        ServerSocket server = new ServerSocket(55565);
        System.out.println("服务器启动完毕");
        //等待客户端链接
        while (true){
            Socket socket = server.accept();
            new Thread(){
                @Override
                public void run() {
                    try {
                        socket.getInputStream();
                        socket.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }.start();

            System.out.println("一个客户端连接了");
        }




    }
}
