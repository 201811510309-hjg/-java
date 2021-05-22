package C01_JAVA基础.a.d赏金.色;

import java.util.Date;

public class c三色旗2 {

    int length;
    int flagB;
    int flagW;
    int flagR;
    char tmp;
    static char tcr[];

    public void init(char tc[]) {
        this.length = tc.length;
        this.flagB = 0;
        this.flagW = 0;
        this.flagR = length - 1;
        this.tcr = tc;
    }

    public void threeColor(char tc[]) {
        init(tc);
        for (;;) {
            if (tcr[flagW] == 'B') {
                tmp = tcr[flagB];
                tcr[flagB] = tcr[flagW];
                tcr[flagW] = tmp;
                flagB++;
                flagW++;
            } else if (tcr[flagW] == 'R') {
                tmp = tcr[flagR];
                tcr[flagR] = tcr[flagW];
                tcr[flagW] = tmp;
                flagR--;
            } else {
                flagW++;
            }

            if (flagW == flagR) {
                break;
            }
            output(tcr);
            System.out.println();
        }
    }

    public void output(char ca[]) {
        for (char c : ca) {
            System.out.print(c);
        }
    }

    public static void main(String args[]) {
        long startTime = new Date().getTime();
        // RWBBWRWRB {"R","W","B","B","W","R","W","R","B"}  困难
        //     原来  {'B','R','R','B','W','R','W','B' }
        //测试ex     {'R','W','B','B','W','R','W','R'}
        char tc[] = {'R','W','B','B','W','R','W','R','B'};
        new c三色旗2().threeColor(tc);

        long endTime = new Date().getTime();
        System.out.println("本程序运行 " + (endTime - startTime)
                + " 毫秒完成。" );
    }
}