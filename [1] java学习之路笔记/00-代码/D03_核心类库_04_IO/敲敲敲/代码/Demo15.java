package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Demo15 {
    public static void main(String[] args) throws FileNotFoundException {
        //try-with-resources
        /*try {
            FileReader fr = new FileReader("c：//book.txt");
            int c = fr.read();
            System.out.println((char)c);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //jdk9
        FileReader fr = new FileReader("c：//book.txt");
        PrintWriter pw = new PrintWriter("c：//book.txt");
        try(fr;pw){
            int c = fr.read();
            System.out.println((char)c);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
