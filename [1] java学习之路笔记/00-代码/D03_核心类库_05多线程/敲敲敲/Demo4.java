package D03_核心类库_05多线程.敲敲敲;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        //线程休眠sleep
        for (int i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
