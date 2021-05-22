package C01_JAVA基础.GoBang;

// 棋盘类
public class Checkerboard {
    /**
     * 显示棋盘
     *             X轴 y轴 对边框进行轴叙述
     *             对初始棋盘
     *             棋局开始后接收棋手的落子
     *             归环境类管，受裁判监控
     *
     * 显示棋子
     */
    private int Vertical=16; //纵经
    private int horizontal=16; //横纬
    public int getVertical() {return Vertical; }
    public int getHorizontal() { return horizontal; }

    //建立五子棋双重数组
    public int[][] chess = new int[this.horizontal][this.Vertical];

    //棋盘初始化方法
    public   void initialization(){

        // 对边框进行轴叙述
        for (int  i = 0; i<16; i++){
            /*chess[0][i]= String.valueOf(i);
            chess[i][0]= String.valueOf(i);*/
            chess[0][i] = i;
            chess[i][0] = i;

        }

        //对初始棋盘进行归零处理
        for(int i = 1;i<16;i++) {
            for(int j =1;j<16;j++) {
//                chess[i][j]="┼";
                chess[i][j] = 0;
            }
        }
    }
    //棋盘呈现方法
    public void present(){
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
    }

    //获得棋盘对象中的棋盘二维数组
    public int[][] getChessboard(){
        return this.chess;
    }

   /* public static void main(String[] args) {
        //产生一个棋盘
        Checkerboard c = new Checkerboard();
        c.initialization();
        c.present();
        c.chess[3][3] = 2;
        c.present();
    }*/

}
