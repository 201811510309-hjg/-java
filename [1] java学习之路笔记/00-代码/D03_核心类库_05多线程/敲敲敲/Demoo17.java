package D03_核心类库_05多线程.敲敲敲;

public class Demoo17 {
    /*
    Lambda表达式
    函数式编程思想  : 关注方法
    面向对象:   创建对象调用方法解决问题.  关注创建对象
     */
    public static void main(String[] args) {
        Thread t = new Thread(()-> {
            System.out.println("hjgnb");
        }) ;
        t.start();

        }
    }
