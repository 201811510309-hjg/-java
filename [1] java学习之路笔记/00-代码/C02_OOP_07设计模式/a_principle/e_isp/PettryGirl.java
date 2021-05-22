package C02_OOP_07设计模式.a_principle.e_isp;

import java.awt.image.ImageConsumer;

public class PettryGirl implements IGoodsBodyGirl,IGreatTempermentGirl {
    private String name;

    public PettryGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name+"面容：倾国倾城比天仙");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name+"身材:窈窕淑女赛西施");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name+"气质：亭亭玉立似贵妃");
    }
}
