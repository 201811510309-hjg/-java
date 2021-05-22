package C02_OOP_04高级.敲敲敲;

/**
 * @quther hjg
 * @date 2021/1/31 17:28
 **/

public class D8_Outer {
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x ){
        this.x = x;
    }
    class Inner{
        private int x = 200;
        public void say(){
            System.out.println(x);
            System.out.println(D8_Outer.this.x);
        }
    }
}
