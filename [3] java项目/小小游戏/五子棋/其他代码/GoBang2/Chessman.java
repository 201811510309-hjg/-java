package C01_JAVA基础.GoBang2;

//根据枚举类写法书写，棋子枚举类只需提供黑白棋两个实例即可
public enum Chessman{
    BLACK("●"),WHITE("○");//注意在黑框框命令行下●是灰色，估计是不够黑的缘故吧
    private String chessman;

    private Chessman(String chessman){
        this.chessman = chessman;
    }

    public String getChessman(){
        return this.chessman;
    }

    //测试
	/*public static void main(String[] args){
		System.out.println(Chessman.BLACK.getChessman());
		System.out.println(Chessman.WHITE.getChessman());
	}*/

}
