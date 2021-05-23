package WZQ02_OOP;

// 棋手类
public class Chess_player {
    /**
     * 下棋
     *         选择非零幸运数字（1,2,3,4,5,6，7，8,9）
     *         悔棋  3次机会
     *         认输
     *         记住自己下的每一步  没有实现
     */

    //下棋
    public static void press(int[][] chess,int who,int x,int y){
        // 1 黑 2 白
        if (who == 1){
            chess[x][y] = 1;
        }else {
            chess[x][y] = 2;
        }
    }
}
