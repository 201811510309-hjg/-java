package C01_JAVA基础.GoBang2;

public class Chessboard{
    //棋盘
    private String[][] chessboard;
    //棋盘长宽
    public static final int CHESSBOARD_SIZE = 15;

    //空参构造函数
    public Chessboard(){}

    //初始化棋盘，用二维数组表示棋盘，每个数组元素都赋值为┼
    public void initChessboard(){
        this.chessboard = new String[CHESSBOARD_SIZE][CHESSBOARD_SIZE];

        //画出棋盘
        for(int i = 0; i< CHESSBOARD_SIZE; i++){
            for(int j = 0; j < CHESSBOARD_SIZE; j++){
                this.chessboard[i][j] = "┼";
            }
        }

    }

    //打印棋盘
    public void printChessboard(){
        for(int i = 0; i<CHESSBOARD_SIZE; i++){
            for(int j = 0; j < CHESSBOARD_SIZE; j++){
                System.out.print(this.chessboard[i][j]);
            }
            System.out.println();
        }
    }

    //把棋盘上的位置（posX, posY）放上棋子chessman，单纯从这一点看，
    //棋盘类确实是依赖游戏类的，也就是说，不玩游戏的话，何谈要打印棋盘呢！
    public void setChessboard(int posX, int posY, String chessman){
        this.chessboard[posX][posY] = chessman;
    }

    //获得棋盘对象中的棋盘二维数组
    public String[][] getChessboard(){
        return this.chessboard;
    }

    //测试
/*	public static void main(String[] args){
		//准备一个棋盘
		Chessboard chessboard = new Chessboard();
		chessboard.initChessboard();
		//打印棋盘
		chessboard.printChessboard();
		//下一个黑子
		chessboard.setChessboard(5,5,"○");
		System.out.println();
		//打印棋盘
		chessboard.printChessboard();
		System.out.println();
		//获得棋盘对象中的棋盘数组并打印
		String[][] chessboard2 = chessboard.getChessboard();
		for(String[] x : chessboard2){
			for(String y : x){
				System.out.print(y);
			}
			System.out.println();
		}
	}*/

}

