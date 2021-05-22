package D03_核心类库_05多线程.敲敲敲;

/**
 * 用于给线程进行执行的任务
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //线程任务
        for (int i=0;i<10;i++){
            System.out.println("子线程---床前明月光"+i);
        }
    }
}
