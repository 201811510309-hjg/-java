package 问题解决;


class C{
    final float PI = 3.1415f;
    int r = 3;

    public float area (int r){
        return PI*r*r;
    }

    public float getPI() {
        return PI;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

public class a001 {
    public static void main(String[] args) {
        C c = new C();
        c.r = 6;
        System.out.println(c.area(c.r));
    }

}


