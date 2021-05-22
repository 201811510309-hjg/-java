package D03_核心类库_05多线程.敲敲敲;
//# 带返回值的线程 Callable
// 三步走
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demoo11 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> c = new MyCallable();
        FutureTask<Integer> task = new FutureTask<>(c);
//        task.isDone();
//        boolean cancel = task.cancel();
        new Thread(task).start();
        Integer j = task.get();
        System.out.println("返回值："+j);
        for (int i =0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    static class MyCallable implements Callable {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            for (int i =0;i<10;i++){
                System.out.println(i);
            }
            return 100;
        }
    }
}
