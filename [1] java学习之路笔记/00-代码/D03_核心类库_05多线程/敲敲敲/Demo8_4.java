package D03_核心类库_05多线程.敲敲敲;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo8_4 {
    public static void main(String[] args) {
        //线程不安全
        //解决方案 3-显式锁Lock 子类 ReentrantLock


        Runnable run = new Demo8_4.Ticket();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();

    }
    static class Ticket implements Runnable{
        //票数
        private int count = 5;
        //显式锁  l: fair参数为true就表示是公平锁
        Lock l = new ReentrantLock(true);
        @Override
        public void run() {
            while (true){
                l.lock();
                if (count>0){
                    //买票
                    System.out.println("正在准备买票");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println("出票成功，余票："+count);
                }
                l.unlock();
            }

        }
    }
}
