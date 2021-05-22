package D03_核心类库_05多线程.线程操作图片粒子化飞散及复原;

public class PVector {
    public float x,y;
    public PVector(float x, float y) {
        //后续创建location、veloc、acce具体对象时，导入数值
        this.x=x;
        this.y=y;
    }

    public void add(PVector pvector) {
        //向量相加，用于后续位置location＋速度veloc以及速度veloc＋加速度acce
        this.x+=pvector.x;
        this.y+=pvector.y;
    }

    public float getX() {
        //后续粒子需要调转反向运动时，需要获取此时的x轴上的加速度值
        return this.x;
    }

    public float getY() {
        //后续粒子需要调转反向运动时，需要获取此时的y轴上的加速度值
        return this.y;
    }
}

