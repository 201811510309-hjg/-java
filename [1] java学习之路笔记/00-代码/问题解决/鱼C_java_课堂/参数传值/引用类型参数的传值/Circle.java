package 问题解决.鱼C_java_课堂.参数传值.引用类型参数的传值;

public class Circle{
    double radius;
    Circle(double r){
        radius = r;
    }
    double getArea(){
        return 3.14 * radius * radius;
    }
    void setRadius(double r){
        radius = r;
    }
    double getRadius(){
        return radius;
    }
}