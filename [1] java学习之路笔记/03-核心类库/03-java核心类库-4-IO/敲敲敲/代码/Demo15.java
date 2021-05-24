package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo15 {
    public static void main(String[] args) throws FileNotFoundException {
        //try-with-resources
        //1.7 之前
        /*try {
            FileReader fr = new FileReader("c：//book.txt");
            int c = fr.read();
            System.out.println((char)c);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //jdk9 进行优化  自动关闭
        /*FileReader fr = new FileReader("c：//book.txt");
        PrintWriter pw = new PrintWriter("c：//book.txt");
        try(fr;pw){
            int c = fr.read();
            System.out.println((char)c);
        }catch (IOException e) {
            e.printStackTrace();
        }*/

        CloseDemo d = new CloseDemo();
        try(d){

        }catch (Exception e){

        }

    }
    static class CloseDemo implements Closeable{

        @Override
        public void close() throws IOException {
            System.out.println("close 方法被调用。。");
        }
    }

}
