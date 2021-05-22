package C02_OOP_07设计模式.a_principle.d_dip;
//场景类：属于高层模块，高层业务逻辑，他对低层的依赖都建立在抽象上
public class Client {
    public static void main(String[] args) {
        IDriver james = new Driver();
        ICar benz = new Benz();
        ICar bmw = new BMW();

        james.drive(benz);
        james.drive(bmw);
    }



}
