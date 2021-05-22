package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileWriter;
import java.io.IOException;


public class Demo9 {
    public static void main(String[] args) throws IOException {
        //writer
        FileWriter fw = new FileWriter("c://b.txt",true);
        //fw.write('a');
        fw.append("锄禾日当午").append("，").append("汗滴禾下土");   //可以一致追加
        fw.write("锄禾日当午");
        fw.flush();        //刷新
        fw.close();

    }
}
