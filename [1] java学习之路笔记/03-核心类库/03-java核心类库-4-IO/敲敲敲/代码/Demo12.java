package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo12 {
    public static void main(String[] args) throws FileNotFoundException {
        //收集异常信息
        try {
            String s = null;
            s.toString();
        }catch (Exception e){  // 收集异常信息 框架&& 库
            PrintWriter pw = new PrintWriter("f://bug.txt");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            pw.print(format.format(new Date()));
            e.printStackTrace(pw);
            pw.close();
        }
    }
}
