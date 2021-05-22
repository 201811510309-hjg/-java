package D03_核心类库_05多线程.线程操作图片粒子化飞散及复原;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Listener extends MouseAdapter{
    private MoveThread mt;
    public Listener(MoveThread mt) {
        this.mt=mt;
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==1) {//点击鼠标左键
            mt.isstart=true;
        }
        if(e.getButton()==3) {//点击鼠标右键
            mt.back=true;
            mt.boundcount=mt.count;
            mt.count=2*mt.count;//count时间变为原本正向运动速度达到峰值花费的count时间的两倍，用来开始减速和反向运动
            for(int i=0;i<mt.list.size();i++) {
                //遍历所有队列中的像素粒子运动对象使其加速度反向
                Mover mover=mt.list.get(i);
                mover.acce=new PVector(-mover.acce.getX(),-mover.acce.getY());
            }
        }
    }
}

