package 问题解决;


//局部变量 和 全局变量
public class a007 {
    private static int a;

    public static void main(String[] args) {
        methodName(a);
        System.out.println(a);
    }
    // int a  int b
    public static void methodName(int b){
        a++;
    }



    //编译出错  初始化问题
    public void hellojava(){
        int i,j,k = 0;
        i = 10; //初始化了
        while (i>0){
            j = i*5;
            System.out.println("j = "+j);
            k = k +1;  // 没有初始化会出错
            i--;
        }
    }

}
