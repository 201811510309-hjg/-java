package 问题解决.鱼C_java_课堂.对象的组合;

/**
 * 2. Circle.java 中的 Circle 类有 double 型的成员变量 x、y、radius，分别用来表示对象的圆心坐标和圆的半径。该类提供
 *
 * 了修改 x、y、radius 以及返回 x、y、radius 的方法。
 */
public class Circle{

    double x,y,radius;

    public void setX(double a){
        x = a;
    }

    public double getX(){
        return x;
    }

    public void setY(double b){
        y = b;
    }

    public double getY(){
        return y;
    }

    public void setRadius(double r){
        if(r > 0){
            radius = r;
        }
    }

    public double getRadius(){
        return radius;
    }

}
