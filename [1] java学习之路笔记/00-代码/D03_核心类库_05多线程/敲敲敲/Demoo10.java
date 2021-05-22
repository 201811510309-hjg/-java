package D03_核心类库_05多线程.敲敲敲;

public class Demoo10 {
    //# 生产者与消费者
    public static void main(String[] args) {
        Food f = new Food();
        new Cook(f).start();
        new Waiter(f).start();

    }
    //厨师
    static class Cook extends Thread{
        private Food f;

        public Cook(Food f) {
            this.f = f;
        }

        @Override
        public void run() {
            for(int i=0;i<100;i++){
                if(i%2==0){
                    f.setNameAndSaste("老干妈小米粥","香辣味");
                }else{
                    f.setNameAndSaste("煎饼果子","甜辣味");
                }
            }
        }
    }
    //服务员
    static class Waiter extends Thread{
        private Food f;

        public Waiter(Food f) {
            this.f = f;
        }

        @Override
        public void run() {
            for(int i=0;i<100;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                f.get();
            }
        }
    }
    //食物
    static class Food {
        private String name;
        private String taste;

        //true 表示可以生产
        private boolean flag = true;

        public synchronized void setNameAndSaste(String name,String taste){
            if (flag){
                this.name = name ;
                // 故意休眠，
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                this.taste = taste;

                flag = false;
                this.notifyAll(); //唤醒
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void get(){
            if (!flag){  // false 厨师没做饭
                System.out.println("服务员端走的菜的名称是:" + name + ",味道:" + taste);
                flag = true;  //让厨师开始做饭
                this.notifyAll();  //把厨师唤醒
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
