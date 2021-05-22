package C01_JAVA基础.GoBang;

import java.util.Scanner;
public class Main {
    //自己和自己下
//    private static int[][] c;

    public static void main(String[] args) {
        //产生一个棋盘
        Checkerboard c = new Checkerboard();
        //产生一个棋手   下子权限
        Chess_player player = new Chess_player();
        //产生一个裁判   棋盘所有权限
        Referee referee = new Referee();

        //游戏开始
        System.out.println("游戏开始！");
        c.initialization();
        c.present();
//        int[][] chess = c.getChessboard();

        System.out.println("棋盘就位,棋手就位，裁判就位，请猜先。");
        int a = referee.caixian();
        int p1,p2 = 0;
        String s1,s2 = "";
        if (a == 1){
            p1 = 1;p2 = 2;s1 = "黑选手";s2 = "白选手";
            System.out.println("黑先。");
        }else {
            p1 = 2;p2 = 1;s1 = "白选手";s2 = "黑选手";
            System.out.println("白先。");
        }
        System.out.println("准备好了？ 开始");
        //建立回合变量step
        int step = 1;
        //建立输入变量
        Scanner input = new Scanner(System.in);
        //开始回合循环
        win:do {
            System.out.println('请' + s1 + "输入x坐标");
            referee.x = input.nextInt();
            System.out.println('请' + s1 +"输入y坐标");
            referee.y = input.nextInt();
            if (referee.fangui(c.chess,p1,referee.x, referee.y)){
                player.press(c.chess,p1,referee.x, referee.y);
                c.present();
                if(referee.panying(c.chess,p1,referee.x, referee.y)){
                    System.out.println("比赛结束、、");
                    break ;
                }
            }
            System.out.println('请' + s2 +"输入x坐标");
            referee.x = input.nextInt();
            System.out.println('请' + s2 +"输入y坐标");
            referee.y = input.nextInt();
            if (referee.fangui(c.chess,p2,referee.x, referee.y)){
                player.press(c.chess,p2,referee.x, referee.y);
                c.present();
                if(referee.panying(c.chess,p2,referee.x, referee.y)){
                    System.out.println("比赛结束、、");
                    break ;
                }
            }

            //一回合结束，step+1
            step++;
        }while(step<112);
        /*
         *注：因为共有15*15=225个棋子位，一轮下来黑方和白方共下两个棋子，
         *	  故准备（15*15）/2=112个回合。
         */
    }
}
