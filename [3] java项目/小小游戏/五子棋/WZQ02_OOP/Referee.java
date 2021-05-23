package WZQ02_OOP;

import java.util.Random;

// 裁判类
public class Referee {
    /**
     * 有一个棋盘
     * 判断先手，确定黑白
     *         限时指定谁下，超时犯规，对方赢
     *         怎么算犯规
     *             下棋的地方有棋子
     *             下棋的地方越界
     *         判断谁赢
     *
     *         记录棋手可选择幸运数字（1,2,3,4,5,6，7，8,9）
     *         记录回合数（最多（15*15）/2=112个回合）
     */
    //建立校正X,Y范围是否合理的变量 裁判心里有数
    int x,y;

    //建立黑方和白方的X,Y轴数据变量
    int blackYInput = 0;int blackXInput = 0;
    int whiteYInput = 0;int whiteXInput = 0;

    //猜先
    public  int   caixian(){
        // 1 黑先 2 白先
        Random r = new Random();
        int a = r.nextInt(100);
        if (a<49){return 1; }else { return 2; }
    }
    //限时棋手轮下
    public  void time() {
        int time = 60;
        while (time > 0) {
            time--;
            try {
                Thread.sleep(1000);
                int hh = time / 60 / 60 % 60;
                int mm = time / 60 % 60;
                int ss = time % 60;
                System.out.println("还剩" + ss + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    //犯规
    public  boolean fangui(int [][] chess, int who, int x, int y){
        //判断越界
        if (x<1 | x>15 | y<1 | y>15){
            System.out.println("手别抖啊，都下出界了");
            return false;
        }
        //判断有子，谁的子
        if (chess[x][y] == 1 ){
            if(who == 1){
                System.out.println("黑哥，这里自己下过的自己不知道？？");
                return false;
            }else {
                System.out.println("白哥，这里已经有黑子了。。。");
                return false;
            }

        }else if(chess[x][y] == 2){
            if(who == 2){
                System.out.println("白哥，这里自己下过的自己不知道？？");
                return false;
            }else {
                System.out.println("黑哥，这里已经有黑子了。。。");
                return false;
            }
        }
        else {
            return true;
        }

    }
    //判赢
    public  boolean panying(int[][] chess,int who,int x,int y){
        int nums =1;
        int a=0;
        String p = "";
        if (who==1){
            p = "黑子赢";
            a = who; } else {
            p = "白子赢";
            a =2; }
        //横向五个连续棋子
        for(int i = 1;i<16;i++) {
            for(int j =1;j<15;j++) {
                if(chess[i][j]==a&&chess[i][j+1]==a) {
                    nums++;
                    if(nums == 5) {
                        System.out.println(p);
                        return true;
                    }
                }else {
                    nums = 1;
                }
            }
        }
        nums = 1;
        //纵向五个连续棋子
        for(int j = 1;j<16;j++) {
            for(int i =1;i<15;i++) {
                if(chess[i][j]==a &&chess[i+1][j]== a ) {
                    nums++;
                    if(nums == 5) {
                        System.out.println(p);
                        return true;
                    }
                }else {
                    nums = 1;
                }
            }
        }
        nums = 1;
        //右上斜5个棋子
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 16 ; j++) {
                judge:for(int k = 1;k<5;k++) {
                    if((j-k)>0&&(i+k)<16) {
                        if(chess[j][i]== a &&chess[j-k][i+k]== a ) {
                            nums++;
                        }else {
                            nums=1;
                            break judge;}
                    }else break judge;
                }
                if(nums==5) {
                    System.out.println(p);
                    return true;
                }
            }
        }
        nums = 1;
        //左上斜五个棋子
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 16 ; j++) {
                judge:for(int k = 1;k<5;k++) {
                    if((j-k)>0&&(i-k)>0) {
                        if(chess[j][i]== a &&chess[j-k][i-k]== a ) {
                            nums++;
                        }else {
                            nums=1;
                            break judge;}
                    }else break judge;
                }
                if(nums==5) {
                    System.out.println(p);
                    return true;
                }
            }
        }
        return false;
    }


    /*public static void main(String[] args) {
        System.out.println(caixian());
        time();
    }*/

}
