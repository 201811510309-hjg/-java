package C02_OOP_07设计模式.a_principle.c_LSP;

public class AUG extends Rifle{
    //狙击枪都携带了精准的望远镜
    public void zoomOut(){
        System.out.println("通过望远镜观察敌人；");
    }

    @Override
    public void shoot() {
        System.out.println("AUG 射击。。。。。。。。。。。。。。。");
    }
}
