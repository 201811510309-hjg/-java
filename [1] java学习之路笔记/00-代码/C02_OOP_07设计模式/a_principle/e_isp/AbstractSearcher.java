package C02_OOP_07设计模式.a_principle.e_isp;

public abstract class AbstractSearcher {

    protected  IPettyGirl girl;

    public AbstractSearcher(IPettyGirl girl) {
        this.girl = girl;
    }

    public abstract void search();
}
