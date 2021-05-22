package C02_OOP_02基础;

/**
 * @quther hjg
 * @date 2021/1/28 21:24
 **/

public class Demo5 {
    public static void main(String[] args) {
        Math m = new Math();
        int num = m.sum(100, 500);
        System.out.println(num);

        double num2 = m.sum(10.5, 20.6);
        System.out.println(num2);
    }
}

// 命名规范 见名知意
class Math{
    /**
     * 一个类中定义的方法， 是允许重载 （相同的方法名称）
     *
     * 1、方法名称相同
     * 2、参数列表长度  或 参数列表类型 或 （参数类型顺序不同）
     *
     * 注意： 与返回值类型无关
     *
     */
    int sum(int x,int y) {
        int z = x+y;
        return z;
    }

    double sum(double x,double y) {
        double z = x+y;
        return z;
    }

    double sum(int x,double y) {
        double z = x+y;
        return z;
    }

    double sum(double y,int x) {
        double z = x+y;
        return z;
    }

}
