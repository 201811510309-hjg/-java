package D03_核心类库_09枚举_注解_反射.敲敲敲;

//Jdk 1.5 之前
public class Level {
    public static final Level LOW = new Level(1);
    public static final Level MEDIUM = new Level(50);
    public static final Level HIGH = new Level(100);


    private  int levelValue;

    private Level(int levelValue){
        this.levelValue = levelValue;
    }

    public int getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(int levelValue) {
        this.levelValue = levelValue;
    }
}
