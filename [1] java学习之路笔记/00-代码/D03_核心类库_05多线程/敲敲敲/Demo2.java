package D03_核心类库_05多线程.敲敲敲;

public class Demo2 {
    public static void main(String[] args) {
        //匿名内部类实现线程
        //不过也是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("子线程---一二三四五"+i);
                }
            }
        }.start();
        for (int i=0;i<10;i++){
            System.out.println("主0线程---六七八九十"+i);
        }
    }
}
