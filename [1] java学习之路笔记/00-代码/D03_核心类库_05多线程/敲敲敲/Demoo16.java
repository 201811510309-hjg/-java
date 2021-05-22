package D03_核心类库_05多线程.敲敲敲;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demoo16 {
    /**
     * 周期性任务定长线程池
     *
     * 周期任务定长线程池.执行流程:
     * 1.判断线程池是否存在空闲线程
     * 2.存在则使用
     * 3．不存在空闲线程,且线程池未满的情况下,则创建线程并放入线程池，然后使用
     * 4．不存在空闲线程,且线程池已满的情况下,则等待线程池存在空闲线程
     * 周期性任务执行时:
     * 定时执行，当某个时机触发时，自动执行某任务.
     */
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        /**
         * 1.定时执行一次
         * 参数1．定时执行的任务
         * 参数2．时长数字
         * 参数3．时长数字的时间单位，TimeUnit的常量指定
         */
        /*service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("123");

            }
        },5, TimeUnit.SECONDS);*/

        /**
         * 周期性执行任务
         * 参数1．任务
         * 参数2．延迟时长数字〔第一次执行在什么时间以后)
         * 参数3．周期时长数字〔每隔多久执行一次)
         * 参数4．时长数字的单位
          */
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("456");
            }
        },5,1, TimeUnit.SECONDS);
    }
}
