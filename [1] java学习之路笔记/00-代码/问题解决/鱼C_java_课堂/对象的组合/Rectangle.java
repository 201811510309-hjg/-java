package 问题解决.鱼C_java_课堂.对象的组合;

/**
 * 1. Rectangle.java 中的 Rectangle 类有 double 型的成员变量 x、y、widht、height，用来表示矩形左上角的位置坐标以
 *
 * 及矩形的宽和高。该类提供了修改 x、y、width、height 以及返回 x、y、width、height 的方法。
 */
public class Rectangle{

    double x,y,width,height;

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

    public void setWidth(double w){
        if(w > 0){
            width = w;
        }
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double h){
        if(height > 0){
            height = h;
        }
    }

    public double getHeight(){
        return height;
    }

}
