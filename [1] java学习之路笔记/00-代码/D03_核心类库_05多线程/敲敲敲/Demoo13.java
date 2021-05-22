package D03_核心类库_05多线程.敲敲敲;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demoo13 {
    /**
     * 缓存线程池
     * 〔长度无限制)
     * 任务加入后的执行流程:
     * 1.判断线程池是否存在空闲线程
     * 2．存在则使用
     * 3．不存在,则创建线程并放入线程池，然后使用
     */
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        //指挥线程池执行新的任务
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
            }
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"锄禾日当午");
            }
        });
    }
}