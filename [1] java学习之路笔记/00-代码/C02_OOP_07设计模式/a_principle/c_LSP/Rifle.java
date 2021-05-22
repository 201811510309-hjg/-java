package C02_OOP_07设计模式.a_principle.c_LSP;

/**
 * @quther hjg
 * @date 2021/1/28 11:09
 **/
//步枪：威力大射程远
public class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("步枪射击----------");
    }
}
