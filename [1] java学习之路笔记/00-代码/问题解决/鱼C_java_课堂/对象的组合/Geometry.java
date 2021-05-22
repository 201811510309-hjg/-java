package 问题解决.鱼C_java_课堂.对象的组合;

/**
 * 3. Geometry.java 中的 Geometry 类有 Rectangle 类型和 Circle 类型的成员变量，名字分别为 rect 和 circle，也就是说，
 *
 * Geometry 类创建的对象（几何图形）是由一个 Rectangle 对象和一个 Circle 对象组合而成。该类提供了修改 rect、circle
 *
 * 位置和大小的方法，并提供了显示 rect 和 circle 位置关系的方法。
 */
public class Geometry{

    Rectangle rect;
    Circle circle;

    Geometry(Rectangle rect,Circle circle){
        this.rect = rect;
        this.circle = circle;
    }

    public void setCirclePosition(double x,double y){
        circle.setX(x);
        circle.setY(y);
    }

    public void setCircleRadius(double radius){
        circle.setRadius(radius);
    }

    public void setRectanglePosition(double x,double y){
        rect.setX(x);
        rect.setY(y);
    }

    public void setRectangleWidthAndHeight(double w,double h){
        rect.setWidth(w);
        rect.setHeight(h);
    }

    public void showState(){
        double circleX = circle.getX();
        double rectX = rect.getX();
        if(rectX - rect.getWidth() >= circleX + circle.getRadius()){
            System.out.println("矩形在圆的右侧");
        }
        if(rectX + rect.getWidth() <= circleX - circle.getRadius()){
            System.out.println("矩形在圆的左侧");
        }
    }

}
