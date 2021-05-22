package C02_OOP_07设计模式.a_principle.a_ocp;

/**
 * @quther He Jianguang*@date 2021/1/28 9:28
 */

public class NovelBook implements IBook {
    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
