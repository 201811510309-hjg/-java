package D03_核心类库_05多线程.敲敲敲;

public class Demo7 {
    public static void main(String[] args) {
       /* 线程:分为守护线程和用户线程
        用户线程:当一个进程不包含任何的存活的用户线程时，进行结束．
        守护线程:守护用户线程的，当最后一个用户线程结束时，所有守护线程自动死亡，*/
        Thread t1 = new Thread(new MyRunnable());
        //设置t1 为守护线程
        t1.setDaemon(true);
        t1.start();
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {e.printStackTrace(); } }
        //给t1 添加中断标记
        t1.interrupt(); }
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
//                    System.out.println("好的，我si了");
//                    return;
                }
            }
        }
    }
}
