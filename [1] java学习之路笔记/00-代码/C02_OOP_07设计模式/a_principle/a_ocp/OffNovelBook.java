package C02_OOP_07设计模式.a_principle.a_ocp;

/**
 * @quther He Jianguang*@date 2021/1/28 9:52
 *
 * 扩展的 NovelBook 子类
 */

public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int selPrice=super.getPrice();
        int offPrice=0;
        if(selPrice>7000){
            offPrice=selPrice*90/100;
        }
        else{
            offPrice=selPrice*80/100;
        }
        return offPrice;
    }
}
