package 问题解决.鱼C_java_课堂.参数传值.引用类型参数的传值;

public class Circular{
    Circle bottom;
    double height;
    Circular(Circle c,double h){                //构造方法，将Circle类的实例的引用传递给bottom
        bottom = c;
        height = h;
    }
    double getVolme(){
        return bottom.getArea() * height / 3.0;
    }
    double getBottomRadius(){
        return bottom.getRadius();
    }
    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}