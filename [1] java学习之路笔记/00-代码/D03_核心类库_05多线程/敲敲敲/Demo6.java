package D03_核心类库_05多线程.敲敲敲;

public class Demo6 {
    public static void main(String[] args) {
        //线程的中断
        //一个线程是一个独立的执行路径，它是否应该结束，应该由其自身决定  有生命
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //给t1 添加中断标记
        t1.interrupt();


    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<=10;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                    //打标记进入 catch 块 交代处理后事 然后自杀；；；；；；
//                    System.out.println("没事，让我多活一会儿.....");
                    System.out.println("好的，我si了");
                    return;
                }
            }
        }
    }
}
