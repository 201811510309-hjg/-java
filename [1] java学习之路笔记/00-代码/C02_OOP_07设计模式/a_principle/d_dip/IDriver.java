package C02_OOP_07设计模式.a_principle.d_dip;
//司机接口
public interface IDriver {
    //司机驾驶汽车：通过传入ICar接口实现抽象之间的依赖关系
    void drive(ICar car);
}
