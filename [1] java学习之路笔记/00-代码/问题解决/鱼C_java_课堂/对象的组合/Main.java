package 问题解决.鱼C_java_课堂.对象的组合;

/**
 * 4. Main.java 含有主类，主类在 main 方法中用 Geometry 类创建对象，该对象调用相应的方法设置其中圆的位置和半径
 *
 * 调用相应的方法设置其中矩形的位置以及宽和高。
 */
public class Main{

    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        Geometry geometry;
        geometry = new Geometry(rect,circle);
        geometry.setRectanglePosition(30,40);
        geometry.setRectangleWidthAndHeight(120,80);
        geometry.setCirclePosition(260,30);
        geometry.setCircleRadius(60);
        System.out.print("几何图形中圆和矩形的位置关系是：");
        geometry.showState();
        System.out.println("几何图形重新调整了圆的矩形的位置。");
        geometry.setRectanglePosition(220,160);
        geometry.setCirclePosition(40,30);
        System.out.print("调整后，几何图形中圆和矩形的位置关系是：");
        geometry.showState();
    }

}
