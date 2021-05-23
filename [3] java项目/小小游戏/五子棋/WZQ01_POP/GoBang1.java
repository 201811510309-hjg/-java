package WZQ01_POP;
import java.util.Scanner;
public class GoBang1 {
    public static void main(String[] args) {
        int[][] chess = new int[16][16]; //建立五子棋双重数组
        Scanner input = new Scanner(System.in); //建立输入变量
        int x,y;  //建立校正X,Y范围是否合理的变量
        //建立黑方和白方的X,Y轴数据变量
        int blackYInput = 0;int blackXInput = 0;
        int whiteYInput = 0;int whiteXInput = 0;
        int nums = 1; //建立连续棋子的数目变量
        //对边框进行轴叙述
        for(int i = 0;i<16;i++) {
            chess[0][i]=i;
            chess[i][0]=i;
        }
        //对初始棋盘进行归零处理
        for(int i = 1;i<16;i++) {
            for(int j =1;j<16;j++) {
                chess[i][j]=0;
            }
        }

        //游戏开始
        System.out.println("游戏开始！");
        //打印出棋盘
        for(int i = 0;i<16;i++) {
            for(int j =0;j<16;j++) {
                if((i==0&&j>=10)||(i>=10&&j==0)) {
                    System.out.print(chess[i][j]+" ");
                }else {
                    System.out.print(chess[i][j]+"  ");
                }
            }
            System.out.println("");
        }
        int step = 1; //建立回合变量step
        //开始回合循环
        win:do {
            /*
             * 分别输入进黑方X和Y的值，并对相应值得数组进行赋值“1”操作
             * 同时，加入了输入数字超出数字范围的警告循环，尽量更加贴近现实。
             */
            System.out.println("请黑方输入x坐标");
            x = input.nextInt();
            if(x<1||x>15) {
                for(;x<1||x>15;) {
                    System.out.println("超出范围！请黑方重新输入X坐标");
                    x = input.nextInt();
                }
            }
            blackXInput = x;
            System.out.println("请黑方输入y坐标");
            y = input.nextInt();
            if(y<1||y>15) {
                for(;y<1||y>15;) {
                    System.out.println("超出范围！请黑方重新输入Y坐标");
                    y = input.nextInt();
                }
            }
            blackYInput = y;


            /*
             * 注：此处设有同一个位置下两个棋子的故障检测系统，
             * 	    若同一位置先前有棋子，则会报错要求重新输入。
             */
            for(;chess[blackYInput][blackXInput]==1||chess[blackYInput][blackXInput]==2;) {
                System.out.println("重复！请黑方重新输入X坐标");
                blackXInput = input.nextInt();
                System.out.println("重复！请黑方重新输入y坐标");
                blackYInput = input.nextInt();
            }
            chess[blackYInput][blackXInput]=1;
            //赋值后进行打印操作
            for(int i = 0;i<16;i++) {
                for(int j =0;j<16;j++) {
                    if((i==0&&j>=10)||(i>=10&&j==0)) {
                        System.out.print(chess[i][j]+" ");
                    }else {
                        System.out.print(chess[i][j]+"  ");
                    }
                }
                System.out.println("");
            }
            //判断黑方是否赢
            //横向五个连续棋子
            for(int i = 1;i<16;i++) {
                for(int j =1;j<15;j++) {
                    if(chess[i][j]==1&&chess[i][j+1]==1) {
                        nums++;
                        if(nums == 5) {
                            System.out.println("黑子胜！");
                            break win;
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
                    if(chess[i][j]==1&&chess[i+1][j]==1) {
                        nums++;
                        if(nums == 5) {
                            System.out.println("黑子胜!");
                            break win;
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
                            if(chess[j][i]==1&&chess[j-k][i+k]==1) {
                                nums++;
                            }else {
                                nums=1;
                                break judge;}
                        }else break judge;
                    }
                    if(nums==5) {
                        System.out.println("黑子胜！");
                        break win;
                    }
                }
            }
            nums = 1;
            //左上斜五个棋子
            for (int i = 1; i < 15; i++) {
                for (int j = 1; j < 16 ; j++) {
                    judge:for(int k = 1;k<5;k++) {
                        if((j-k)>0&&(i-k)>0) {
                            if(chess[j][i]==1&&chess[j-k][i-k]==1) {
                                nums++;
                            }else {
                                nums=1;
                                break judge;}
                        }else break judge;
                    }
                    if(nums==5) {
                        System.out.println("黑子胜！");
                        break win;
                    }
                }
            }
            /*
             *
             * 黑白分割线
             *
             */
            /*
             * 分别输入进白方X和Y的值，并对相应值得数组进行赋值“2”操作
             * 同时，加入了输入数字超出数字范围的警告循环，尽量更加贴近现实。
             */
            System.out.println("请白方输入X坐标");
            x = input.nextInt();
            if(x<1||x>15) {
                for(;x<1||x>15;) {
                    System.out.println("超出范围！请白方重新输入X坐标");
                    x = input.nextInt();
                }
            }
            whiteXInput = x;

            System.out.println("请白方输入Y坐标");
            y = input.nextInt();
            if(y<1||y>15) {
                for(;y<1||y>15;) {
                    System.out.println("超出范围！请白方重新输入Y坐标");
                    y = input.nextInt();
                }
            }
            whiteYInput = y;
            /*
             * 注：此处设有同一个位置下两个棋子的故障检测系统，
             * 	    若同一位置先前有棋子，则会报错要求重新输入。
             */
            for(;chess[whiteYInput][whiteXInput]==1||chess[whiteYInput][whiteXInput]==2;) {
                System.out.println("重复！请白方重新输入X坐标");
                whiteXInput = input.nextInt();
                System.out.println("重复！请白方重新输入Y坐标");
                whiteYInput = input.nextInt();
            }
            chess[whiteYInput][whiteXInput]=2;
            //赋值后进行打印操作
            for(int i = 0;i<16;i++) {
                for(int j =0;j<16;j++) {
                    if((i==0&&j>=10)||(i>=10&&j==0)) {
                        System.out.print(chess[i][j]+" ");
                    }else {
                        System.out.print(chess[i][j]+"  ");
                    }
                }
                System.out.println("");
            }
            //判断白方是否赢
            //横向五个连续棋子
            for(int i = 1;i<16;i++) {
                for(int j =1;j<15;j++) {
                    if(chess[i][j]==2&&chess[i][j+1]==2) {
                        nums++;
                        if(nums == 5) {
                            System.out.println("白子胜！");
                            break win;
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
                    if(chess[i][j]==2&&chess[i+1][j]==2) {
                        nums++;
                        if(nums == 5) {
                            System.out.println("白子胜!");
                            break win;
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
                            if(chess[j][i]==2&&chess[j-k][i+k]==2) {
                                nums++;
                            }else {
                                nums=1;
                                break judge;}
                        }else break judge;
                    }
                    if(nums==5) {
                        System.out.println("白子胜！");
                        break win;
                    }
                }
            }
            nums = 1;
            //左上斜五个棋子
            for (int i = 1; i < 15; i++) {
                for (int j = 1; j < 16 ; j++) {
                    judge:for(int k = 1;k<5;k++) {
                        if((j-nums)>0&&(i-nums)>0) {
                            if((chess[j][i]==2)&&(chess[j-nums][i-nums]==2)) {
                                nums++;

                            }else {
                                nums=1;
                                break judge;}
                        }else break judge;
                    }
                    if(nums==5) {
                        System.out.println("白子胜！");
                        break win;
                    }
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
