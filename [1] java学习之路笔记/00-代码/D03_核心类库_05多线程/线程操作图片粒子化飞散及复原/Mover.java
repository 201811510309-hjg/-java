package D03_核心类库_05多线程.线程操作图片粒子化飞散及复原;

import java.awt.*;

public class Mover {
    private PVector location;
    private PVector veloc;
    public PVector acce;
    private int color;
    private int size=20;
    public Mover(PVector location, PVector veloc, PVector acce, int color) {
        this.location=location;
        this.veloc=veloc;
        this.acce=acce;
        this.color=color;
    }

    public void Draw(Graphics g) {
        //画出像素粒子小球的方法
        g.setColor(new Color(color));//设置画笔画像素粒子小球的颜色
        g.fillOval((int)location.x, (int)location.y, size, size);//画出画像素粒子小球
    }

    public void Move() {
        //像素粒子小球运动的方法
        veloc.add(acce);//速度的变化：速度加上加速度
        location.add(veloc);//位置的变化：位置加上速度
    }
}

