package D03_核心类库_05多线程.敲敲敲;

public class Demo8_2 {
    public static void main(String[] args) {
        //线程不安全
        //解决方案2-同步方法
        //格式: synchronized(锁对象）{
        //    }

        Runnable run = new Demo8_2.Ticket();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();


    }
    static class Ticket implements Runnable {
        //票数
        private int count = 10;
        private Object o = new Object();
        @Override
        public void run() {
            while (true) {
                synchronized (o){
                    boolean flag = sale();
                    if(!flag){
                        break;
                    }

                }
            }
        }

        public synchronized boolean sale(){
            //this
            //Ticket.class
            /**
             * new Thread(new Demo8_2.Ticket()).start();
             * new Thread(new Demo8_2.Ticket()).start();
             * new Thread(new Demo8_2.Ticket()).start();
             */
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
                return true;
            }
            return false;
        }

    }
}

