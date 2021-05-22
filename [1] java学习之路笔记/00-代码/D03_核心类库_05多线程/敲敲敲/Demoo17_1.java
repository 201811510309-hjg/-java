package D03_核心类库_05多线程.敲敲敲;

public class Demoo17_1 {
    public static void main(String[] args) {
        /*print(new Mymath() {
            @Override
            public int sum(int x, int y) {
                return x+y;
            }
        },100,200);*/

        print((int x,int y) -> {
            return x+y;
        },100,200);

    }

    public static void print(Mymath m,int x,int y){
        int num = m.sum(x,y);
        System.out.println(num);
    }
    static interface Mymath{
        int sum(int x,int y);
    }
}
