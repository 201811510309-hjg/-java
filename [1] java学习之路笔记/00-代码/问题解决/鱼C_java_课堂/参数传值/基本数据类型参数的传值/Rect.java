package 问题解决.鱼C_java_课堂.参数传值.基本数据类型参数的传值;

public class Rect{                      //创建矩形的类

    double width,height,area;

    void setWidth(double width){
        if(width > 0){
            this.width = width;
        }
    }

    void setHight(double height){
        if(height > 0){
            this.height = height;
        }
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    double getArea(){
        area = width * height;
        return area;
    }

}
