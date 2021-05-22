package D03_核心类库_05多线程.线程操作图片粒子化飞散及复原;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class MoveThread extends Thread{
    public ArrayList<Mover> list=new ArrayList();
    private Graphics g;
    boolean isstart=false;
    boolean back=false;
    public int count=0;
    public int boundcount=0;
    public MoveThread(Graphics g) {//构造器，传入画笔
        this.g=g;
        init();
    }

    public int[][] getImagePixel(String Image){
        File file=new File(Image);
        BufferedImage bi=null;
        try {
            bi=ImageIO.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int w=bi.getWidth();
        int h=bi.getHeight();
        int[][] Array=new int[w][h];
        for(int i=0;i<w;i++) {
            for(int j=0;j<h;j++) {
                int pixel=bi.getRGB(i, j);
                Array[i][j]=pixel;
            }
        }
        return Array;
    }

    public void init() {
        int[][] Array2=getImagePixel("C:\\Users\\20322\\Desktop\\haidiyuleipng-001.png");
        for(int i=0;i<Array2.length;i+=3) {
            for(int j=0;j<Array2[i].length;j+=3) {
                int color=Array2[i][j];
                PVector location=new PVector(i+50,j+50);
                PVector veloc=new PVector(0,0);
                Random random=new Random();
                float fx=random.nextFloat()*2-1;
                float fy=random.nextFloat()*2-1;
                PVector acce=new PVector(fx,fy);
                Mover mover=new Mover(location,veloc,acce,color);
                list.add(mover);
            }
        }
    }

    public void run() {
        while(true) {
            BufferedImage bufferedimage=new BufferedImage(1200, 1200, BufferedImage.TYPE_INT_RGB);
            Graphics gr=bufferedimage.getGraphics();
            if(isstart) {
                for(int i=0;i<list.size();i++) {
                    Mover mover=list.get(i);
                    mover.Move();
                    mover.Draw(gr);
                }
                g.drawImage(bufferedimage, 0, 0, null);
                if(back) {
                    count--;
                    if(count==0) {
                        for(int i=0;i<list.size();i++) {
                            Mover mover=list.get(i);
                            mover.acce=new PVector(-mover.acce.getX(),-mover.acce.getY());
                        }
                    }
                    if(count<0) {
                        boundcount--;
                        System.out.println("boundcount"+boundcount);
                    }
                    if(boundcount==0) {
                        System.out.println("boundcount"+boundcount);
                        isstart=false;
                    }
                }else {
                    count++;
                }
                System.out.println("count"+count);
            }
            try {
                Thread.sleep(40);
            } catch (Exception e) {}
        }
    }
}


