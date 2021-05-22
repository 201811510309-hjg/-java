package D03_核心类库_05多线程.敲敲敲;

public class Demo8 {
    //线程不安全
    //eg:买票  多态
    public static void main(String[] args) {
        Runnable run = new Ticket();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();

    }
    static class Ticket implements Runnable{
        //票数
        private int count = 5;
        @Override
        public void run() {
            while (count>0){
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
        }
    }









}
