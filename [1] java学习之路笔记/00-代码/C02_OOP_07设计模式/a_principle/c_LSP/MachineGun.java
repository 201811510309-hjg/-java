package C02_OOP_07设计模式.a_principle.c_LSP;

/**
 * @quther hjg
 * @date 2021/1/28 11:11
 **/

////机枪：威力更大连续发射
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("机枪射击----------");
    }
}