package D03_核心类库_09枚举_注解_反射.敲敲敲;

public enum Level2 {
    LOW(1),MEDIUM(51),HIGH(100);

    private  int levelValue;

    Level2(int levelValue) {
        this.levelValue = levelValue;
    }

    public int getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(int levelValue) {
        this.levelValue = levelValue;
    }
}
