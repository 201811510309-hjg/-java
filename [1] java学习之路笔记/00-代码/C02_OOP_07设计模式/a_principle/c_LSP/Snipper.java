package C02_OOP_07设计模式.a_principle.c_LSP;

public class Snipper extends Soldier{
    public void killEnemy(AUG aug) {
        //先观察
        aug.zoomOut();
        aug.shoot();
    }
}
