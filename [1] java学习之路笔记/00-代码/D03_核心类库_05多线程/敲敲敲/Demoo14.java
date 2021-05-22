package D03_核心类库_05多线程.敲敲敲;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demoo14 {
    /**
     * 定长线程池
     * 定长线程池.
     * (长度是指定的数位)任务加入后的执行流程:
     * 1.判断线程池是否存在空闲线程
     * 2．存在则使用
     * 3．不存在空闲线程,且线程池未满的情况下,则创建线程并放入线程池，然后使用4．不存在空闲线程,且线程池已满的情况下,则等待线程池存在空闲线程
     */
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
