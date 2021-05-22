package C02_OOP_07设计模式.a_principle.e_isp;

public class Searcher extends AbstractSearcher{
    public Searcher(IPettyGirl girl) {
        super(girl);
    }

    @Override
    public void search() {
        System.out.println("搜索到的美女展示如下：");
      /*  super.girl.goodLooking();
        super.girl.niceFigure();
        super.girl.greatTemperament();*/
    }
}
