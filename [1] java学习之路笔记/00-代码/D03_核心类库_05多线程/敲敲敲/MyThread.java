package D03_核心类库_05多线程.敲敲敲;

public class MyThread extends Thread{

    /**
     * run方法就是线程要执行的任务方法
     */

    @Override
    public void run() {
        //这里的代码就是一条新的执行路径．
        //这个执行路径的处罚方式，不是调用run方法 ﹒而是通过thread对象的start()来启动任务
        for (int i=0;i<10;i++){
            System.out.println("子线程==锄禾日当午+"+i);
        }
    }
}
