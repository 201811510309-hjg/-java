package C02_OOP_07设计模式.a_principle.b_SRP;

public interface IConnectionManager extends IPhone{
    //拨通电话
    public void dial(String phoneNumber);
    // 通话完毕，挂断电话
    public void hangup();

}
