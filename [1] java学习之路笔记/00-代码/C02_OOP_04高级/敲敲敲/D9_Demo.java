package C02_OOP_04高级.敲敲敲;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @quther hjg
 * @date 2021/1/31 21:00
 **/
//使用系统的某个API ，来演示局部内部类的使用
public class D9_Demo {
    public static void main(String[] args) {
        Frame f = new Frame("hgj");
        f.setVisible(true);
        f.setSize(300,200);
        class MyWindowListener implements WindowListener{

            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("哈哈哈");

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        }
        MyWindowListener l = new MyWindowListener();
        f.addWindowListener(l);
    }
}
