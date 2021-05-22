package C02_OOP_07设计模式.a_principle.c_LSP;

/**
 * @quther hjg
 * @date 2021/1/28 11:03
 **/
//手枪：携带方便但是射程短
public class Handgan extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击----------");
    }
}
