package D03_核心类库_06网络编程;

import java.io.*;
import java.net.Socket;

//TCP程序
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",55565);
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String text = br.readLine();
        System.out.println("客户端接到消息："+text);

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("服务器你好");




    }
}
