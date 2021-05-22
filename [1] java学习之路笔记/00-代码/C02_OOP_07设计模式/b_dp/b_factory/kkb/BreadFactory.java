package C02_OOP_07设计模式.b_dp.b_factory.kkb;

public class BreadFactory extends AbstractBreadFactory{
    @Override
    public Bread createBread(Class cls) {
        //定义一个生产的面包
        Bread bread=null;
        try {
            //产生一个面包  反射
            bread = (Bread) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("烤面包出错了？！");
        }return bread;
        }
}


