package C02_OOP_07设计模式.a_principle.c_LSP;

/**
 * @quther hjg
 * @date 2021/1/28 11:12
 **/

public class Soldier {
    //士兵使用的枪支
    private AbstractGun gun;
    //通过set方法给士兵配枪
    public void setGun(AbstractGun gun){
        this.gun=gun;
    }
    public void killEnemy(){
        System.out.println("士兵杀敌：");
        gun.shoot();
    }
}
