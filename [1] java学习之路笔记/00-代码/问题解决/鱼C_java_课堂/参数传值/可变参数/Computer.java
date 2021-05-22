package 问题解决.鱼C_java_课堂.参数传值.可变参数;

public class Computer{

    public double getResult(double a,int ... x){
        double result = 0;
        int sum = 0;

        /*for(int i = 0;i < x.length;i++){
            sum = sum + x[i];
        }*/

        for(int param:x){
            sum = sum + param;
        }
        result = a * sum;
        return result;
    }

}