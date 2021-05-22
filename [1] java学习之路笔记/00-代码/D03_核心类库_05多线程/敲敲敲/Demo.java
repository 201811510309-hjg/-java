package D03_核心类库_05多线程.敲敲敲;

public class Demo {
    public static void main(String[] args) {
        /**
         * 多线程技术-1-thread
         */
        /*MyThread m = new MyThread();
        m.start();
        for (int i=0;i<10;i++){
            System.out.println("主线程++汗滴禾下土+"+i);
        }*/

        /**
         * 多线程技术-2- runnable
         * 实现Runnable 与继承Thread相比有如下优势:Ⅰ
         * 1.通过创建任务，然后给线程分配的方式来实现的多线程．更适合多个线程同时执行相同任务的情况.2.可以避免单继承所带来的局限性.
         * 3．任务与线程本身是分离的，提高了程序的健壮性.
         * 4．后续学习的线程池技术，接受Runnable类型的任务，不接收Thread类型的线程..
         */
        //1.    创建一个任务对象
        MyRunnable r = new MyRunnable();
        //2.    创建一个线程，并为其分配一个任务
        Thread t = new Thread(r);
        //3.    执行这个线程
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("主线程---疑是地上霜"+i);
        }

    }
}
