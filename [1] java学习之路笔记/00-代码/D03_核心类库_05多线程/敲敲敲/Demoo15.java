package D03_核心类库_05多线程.敲敲敲;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demoo15 {
    /**
     * 单线程线程池
     * 单线程线程池.执行流程:
     * 1.判断线程池的那个线程是否空闲2．空闲则使用
     * 4．不空闲,则等待池中的单个线程空闲后使用
     */
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
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

    }
}
