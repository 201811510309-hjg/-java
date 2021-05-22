package D03_核心类库_05多线程.敲敲敲;

public class Demo9 {
    //线程死锁
    public static void main(String[] args) {
        Culprit c = new Culprit();
        Police p = new Police();
        new MyThread(c,p).start();
        c.say(p);
    }
    static class MyThread extends Thread{
        private Culprit c;
        private Police p;

        public MyThread(Culprit c, Police p) {
            this.c = c;
            this.p = p;
        }

        @Override
        public void run() {
            p.say(c);
        }
    }
    //罪犯
    static class Culprit{
        public synchronized void say(Police p){
            System.out.println("罪犯:你放了我,我放人质");
            p.fun();
        }
        public synchronized void fun(){
            System.out.println("罪犯 被放走了，罪犯也放了人质");
        }
    }
    //警察
    static class Police{
        public synchronized void say(Culprit c){
            System.out.println("警察:你放了人质,我放过你");
            c.fun();
        }
        public synchronized void fun(){
            System.out.println("警察 救了人质,但是罪犯跑了");
        }
    }
}
