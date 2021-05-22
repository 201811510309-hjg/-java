package C02_OOP_07设计模式.a_principle.c_LSP;

/**
 * @quther hjg
 * @date 2021/1/28 11:13
 **/
//场景类
public class Client {
    public static void main(String[] args) {
        //来一个狙击手
        Snipper hjg = new Snipper();
        //配枪
        hjg.setGun(new AUG());
        hjg.killEnemy();

    }



    public static void main1(String[] args){
        //定义一个士兵许三多
        Soldier xuSanDuo=new Soldier();
        //给许三多配枪：参数可以是任何一把枪：机枪、步枪都可以
        xuSanDuo.setGun(new Rifle());
        xuSanDuo.killEnemy();
    }



}
