package D03_核心类库_05多线程.敲敲敲;

public class Demo8_1 {
    /**
     * 线程同步 ： synchronized
     */
    public static void main(String[] args) {
        //线程不安全
        //解决方案1．同步代码块
        //格式: synchronized(锁对象）{
        //    }

        Runnable run = new Demo8_1.Ticket();
            new Thread(run).start();
            new Thread(run).start();
            new Thread(run).start();

    }
    static class Ticket implements Runnable {
        //票数
        private int count = 5;
        private Object o = new Object();
        @Override
        public void run() {
            while (true) {
                synchronized (o){
                    if (count>0){
                        //买票
                        System.out.println("正在准备买票");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        count--;
                        System.out.println(Thread.currentThread().getName()+"出票成功，余票：" + count);

                    }else {
                        break;
                    }
                }
            }
        }
    }
}
