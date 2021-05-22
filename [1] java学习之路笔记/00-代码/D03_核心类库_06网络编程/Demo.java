package D03_核心类库_06网络编程;

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
        Socket socket = server.accept();
        System.out.println("一个客户端连接了");
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("欢迎你");

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String text = br.readLine();
        System.out.println("服务端接到消息："+text);


        System.out.println("服务器程序执行结束..");

    }
}
