package D03_核心类库_05多线程.敲敲敲;

public class Demo3 {
    public static void main(String[] args) {
        //获取当前线程名称
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(new MyRunnable());
        //设置线程名称
        t.setName("hjg666");
        t.start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
