package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileReader;
import java.io.IOException;


public class Demo10 {
    public static void main(String[] args) throws IOException {
        //reader
        FileReader fr = new FileReader("b.txt");
        while (true){
            int c = fr.read();
            if(c==-1){
                break;
            }
            System.out.print((char)c);
        }
        char[] chars = new char[100];
        //fr.read(chars);
        System.out.println(chars[0]); //0  组装

        int len = fr.read(chars);
        String text = new String(chars,0,len); //避免出现问题
        System.out.println(text);
        System.out.println(text.length());

        fr.close();
    }
}
