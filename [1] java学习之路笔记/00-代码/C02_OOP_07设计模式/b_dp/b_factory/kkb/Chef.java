package C02_OOP_07设计模式.b_dp.b_factory.kkb;

public class Chef {
    public static void main(String[] args) {
        //来一个helloKitty烤箱
        AbstractBreadFactory kitty=new BreadFactory();
        //大厨第1次烤面包稍显急躁，时间不足，于是产生了北极熊面包
        System.out.println("----大厨第1次烤面包");
        Bread polorBearBread=kitty.createBread(PolarBearBread.class);
        polorBearBread.getColor();
        //大厨第2次烤面包耐心十足，时间过长，于是产生了黑熊面包
        System.out.println("----大厨第2次烤面包");
        Bread blackBearBread=kitty.createBread(BlackBearBread.class);
        blackBearBread.getColor();
        //大厨第3次烤面包机智无比,时间刚刚好，于是产生了布朗熊面包
        System.out.println("----大厨第3次烤面包");
        Bread brownBearBread=kitty.createBread(BrownBearBread.class);
        brownBearBread.getColor();



    }
}
