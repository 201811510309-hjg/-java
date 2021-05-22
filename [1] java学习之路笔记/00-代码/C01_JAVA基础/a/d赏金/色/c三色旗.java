package C01_JAVA基础.a.d赏金.色;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class c三色旗 {
    public static void main(String[] args) throws IOException {
        long startTime = new Date().getTime();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入三色旗顺序（ex. RWBBWRWR）："); //RWBBWRWRB
        String flags = buf.readLine();

        TCF tcf = new TCF();
        flags = tcf.move(flags.toUpperCase().toCharArray());

        System.out.println("移动顺序后：" + flags);
        System.out.println("共交换了"+ TCF.count+"次");

        long endTime = new Date().getTime();
        System.out.println("本程序运行 " + (endTime - startTime)
                + " 毫秒完成。" );

    }

    public static class TCF{ //TCF  ThreeColorsFlags
        static int count = 0;
        private void swap(char[] flags,int x,int y){
            char temp;
            temp = flags[x];
            flags[x] = flags[y];
            flags[y] = temp;
            /*flags[x] = (char) (flags[x]^flags[y]);
            flags[y] = (char) (flags[x]^flags[y]);
            flags[x] = (char) (flags[x]^flags[y]);*/

        }
        public String move(char[] flags){
            int wFlags = 0;
            int bFlags = 0;
            int rFlags = flags.length - 1;

            while (wFlags <= rFlags){
                if (flags[wFlags] == 'W'){
                    wFlags++;
                }else if (flags[wFlags] == 'B'){
                    swap(flags,bFlags,wFlags);
                    bFlags++;
                    wFlags++;
                    count++;
                }else {
                    while (wFlags < rFlags && flags[rFlags] == 'R'){
                        rFlags--;
                        swap(flags,rFlags,wFlags);
                        rFlags--;
                        count++;
                    }
                }
            }
            return new String(flags);
        }
    }

}
