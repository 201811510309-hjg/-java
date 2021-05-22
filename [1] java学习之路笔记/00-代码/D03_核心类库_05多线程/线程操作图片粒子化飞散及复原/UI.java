package D03_核心类库_05多线程.线程操作图片粒子化飞散及复原;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame{
    public void ShowUI() {
        this.setTitle("ggg");
        this.setSize(800, 1200);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        Graphics g=this.getGraphics();
        MoveThread mt=new MoveThread(g);
        Listener ul=new Listener(mt);
        this.addMouseListener(ul);
        mt.start();//启动线程
    }

    public static void main(String[] args) {
        UI ui=new UI();
        ui.ShowUI();
    }
}

