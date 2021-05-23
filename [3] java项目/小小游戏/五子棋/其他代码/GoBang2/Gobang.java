package C01_JAVA基础.GoBang2;

import java.util.Scanner;

public class Gobang{

    //包含棋盘类Chessboard
    private Chessboard chessboard;
    private int posX;//落子横坐标
    private int posY;//落子纵坐标


    //空参构造函数
    public Gobang(){}


    //游戏入口
    public static void main(String[] args){
        Gobang gobang = new Gobang();
        gobang.run();
    }

    //运行游戏
    public void run(){
        //游戏开始提示
        System.out.println("**********游戏开始**********");
        System.out.println("exit----->强行退出**********");
        System.out.println("**********游戏开始**********");
        System.out.println();


        //准备棋盘
        this.chessboard = new Chessboard();
        this.chessboard.initChessboard();
        this.chessboard.printChessboard();

        System.out.println("请按照x,y格式输入棋子坐标");
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            //存储用户输入的字符串到input
            String input = scan.nextLine();
            //如果输入exit，强制退出游戏
            if(input.equals("exit")){
                System.out.println("您已经退出游戏");
                break;
            }
            //输入不合法，重新输入
            if(!isLegal(input)){
                continue;
            }
            //输入合法，相应位置放上黑棋
            if(!isFull()){
                this.chessboard.setChessboard(this.posX,this.posY, Chessman.BLACK.getChessman());

            }else{

                //棋盘已经占满棋子，和棋
                System.out.println("和棋了！是否再玩一盘？输入y重玩，输入其他退出游戏");
                String isReplay = scan.nextLine();
                //如果重玩，输入的是y
                if(isReplay.equals("y")){
                    chessboard.initChessboard();
                    chessboard.printChessboard();
                    continue;
                }else{
                    //如果输入的是非y，结束游戏
                    break;
                }
            }


            //判断用户是否赢了
            if(isWin(posX, posY, Chessman.BLACK.getChessman())){
                this.chessboard.printChessboard();
                System.out.println("恭喜您赢了！是否再玩一盘？输入y重玩，输入其他退出游戏");
                String isReplay = scan.nextLine();
                //如果重玩，输入的是y
                if(isReplay.equals("y")){
                    chessboard.initChessboard();
                    chessboard.printChessboard();
                    continue;
                }else{
                    //如果输入的是非y，结束游戏
                    break;
                }
            }else{

                //用户没有赢，机器就继续下棋，随机找一个空着的位置落子
                int posMachineX = (int)(Math.random()*(this.chessboard.CHESSBOARD_SIZE-1));
                int posMachineY = (int)(Math.random()*(this.chessboard.CHESSBOARD_SIZE-1));
                //得到棋盘数组
                String[][] chessboardArr = this.chessboard.getChessboard();
                while(chessboardArr[posMachineX][posMachineY]!="┼"){
                    posMachineX = (int)(Math.random()*(this.chessboard.CHESSBOARD_SIZE-1));
                    posMachineY = (int)(Math.random()*(this.chessboard.CHESSBOARD_SIZE-1));

                }

                //如果棋盘还没有满的话
                if(!isFull()){
                    this.chessboard.setChessboard(posMachineX ,posMachineY , Chessman.WHITE.getChessman());

                }else{

                    //棋盘已经占满棋子，和棋
                    System.out.println("和棋了！是否再玩一盘？输入y重玩，输入其他退出游戏");
                    String isReplay = scan.nextLine();
                    //如果重玩，输入的是y
                    if(isReplay.equals("y")){
                        chessboard.initChessboard();
                        chessboard.printChessboard();
                        continue;
                    }else{
                        //如果输入的是非y，结束游戏
                        break;
                    }
                }


                //判断机器是否赢了
                if(isWin(posX, posY, Chessman.WHITE.getChessman())){
                    this.chessboard.printChessboard();
                    System.out.println("您输了！是否再玩一盘？(y/n)");
                    String isReplay = scan.nextLine();
                    if(isReplay.equals("y")){
                        chessboard.initChessboard();
                        chessboard.printChessboard();
                        continue;
                    }else{
                        //输入的是非y，退出游戏
                        break;
                    }
                }
            }
            this.chessboard.printChessboard();
            System.out.println("请按照x,y格式输入棋子坐标");

        }
    }

    //判断输入是否合法
    public boolean isLegal(String input){

        //要判断输入的格式是否是x,y格式
        String[] posStrArr = input.split(",");

        try{
            this.posX = Integer.parseInt(posStrArr[0]) - 1;
            this.posY = Integer.parseInt(posStrArr[1]) - 1;
        }catch(Exception e){
            //输入的数字格式不正确，导致用逗号劈开的字符串并不是数字
            chessboard.printChessboard();
            System.out.println("请按照x,y的格式(注意范围1-15)输入： ");
            return false;
        }


        //判断用户输入的坐标是否超过棋盘范围
        if(this.posX < 0 || this.posX >= this.chessboard.CHESSBOARD_SIZE ||
                this.posY < 0 || this.posY >= this.chessboard.CHESSBOARD_SIZE){
            chessboard.printChessboard();
            System.out.println("输入坐标不在棋盘范围(1-15)内，请重新输入： ");
            return false;
        }

        //判断输入的位置上是否已经有棋子
        String[][] chessboard_tmp = this.chessboard.getChessboard();
        if(!chessboard_tmp[this.posX][this.posY].equals("┼")){
            chessboard.printChessboard();
            System.out.println("这个位置上已经有棋子，请重新输入： ");
            return false;
        }

        return true;
    }

    //判断输赢，传入的是当前落下的棋子，可根据颜色判断赢方
    //思路：每行、每列、每斜着的棋子，拼接成串，看是否包含五个黑子或五个白子连着的情况
    public boolean isWin(int posX, int posY, String chessman){
        //五个棋子拼接成一字符串subString
        String subString = "";
        for(int i = 0; i < 5; i++){
            subString += chessman;
        }

        //获得当前对象chessboard的棋盘的二维数组
        String[][] chessboard_tmp = this.chessboard.getChessboard();

        //判断每一行和每一列是否有五子相邻的情况
        for(int i = 0; i < this.chessboard.CHESSBOARD_SIZE; i++){
            //临时字符串，用于拼接每一行的串
            String tmp_row = "";
            //临时字符串，用于拼接每一列的串
            String tmp_col = "";
            for(int j = 0; j < this.chessboard.CHESSBOARD_SIZE; j++){
                tmp_row += chessboard_tmp[i][j];
                tmp_col += chessboard_tmp[j][i];
            }
            if(tmp_row.contains(subString) || tmp_col.contains(subString)){
                return true;
            }
        }

        //判断起点是第一行的斜着的两个方向串是否有五子相邻的情况
        for(int k = 0; k < this.chessboard.CHESSBOARD_SIZE; k++){
            //临时字符串，拼接起点是第一行的斜着的串
            String tmp_left = "";//斜着左下
            String tmp_right = "";//斜着右下
            //斜着右下
            for(int i = 0, j = k; i < this.chessboard.CHESSBOARD_SIZE && j < this.chessboard.CHESSBOARD_SIZE; i++,j++){
                tmp_left += chessboard_tmp[i][j];
            }
            //斜着左下
            for(int i = 0, j = k; i < this.chessboard.CHESSBOARD_SIZE && j >= 0; i++,j--){
                tmp_right += chessboard_tmp[i][j];
            }
            if(tmp_left.contains(subString) || tmp_right.contains(subString)){
                return true;
            }
        }

        //判断起点是最后一行的斜着的两个方向串是否有五子相邻的情况
        for(int k = 0; k < this.chessboard.CHESSBOARD_SIZE; k++){
            //临时字符串，拼接起点是最后一行的斜着的串
            String tmp_left = "";//斜着左上
            String tmp_right = "";//斜着右上
            //斜着右下
            for(int i = this.chessboard.CHESSBOARD_SIZE - 1, j = k; i >= 0 && j >= 0; i--,j--){
                tmp_left += chessboard_tmp[i][j];
            }
            //斜着左下
            for(int i = this.chessboard.CHESSBOARD_SIZE - 1, j=k; i >= 0 && j < this.chessboard.CHESSBOARD_SIZE; i--,j++){
                tmp_right += chessboard_tmp[i][j];
            }
            if(tmp_left.contains(subString) || tmp_right.contains(subString)){
                return true;
            }
        }

        return false;
    }

    //判断棋盘是否已经占满棋子
    public boolean isFull(){

        //得到棋盘数组
        String[][] chessboardArr = this.chessboard.getChessboard();
        //判断是否和棋
        for(int i = 0; i < this.chessboard.CHESSBOARD_SIZE; i++){
            for(int j = 0; j < this.chessboard.CHESSBOARD_SIZE; j++){
                if(chessboardArr[i][j].equals("┼")){
                    return false;
                }
            }
        }
        return true;
    }


}
