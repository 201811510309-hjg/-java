package C02_OOP_07设计模式.a_principle.a_ocp;

/**
 * @quther He Jianguang*@date 2021/1/28 9:27
 */

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new OffNovelBook("红楼梦", 9900, "曹雪芹 "));
        bookList.add(new OffNovelBook("侠客行", 8900, "金  庸 "));
        bookList.add(new OffNovelBook("原则", 6900, "瑞·达利欧"));
        bookList.add(new OffNovelBook("海贼王1", 4900, "尾田荣一郎"));
    }

    public static void main(String[] args) {
        NumberFormat format=NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("-------------书店卖书记录如下----------------------");
        for (IBook book : bookList) {
            System.out.println("书籍名称："+book.getName()+"\t\t作者："+book.getAuthor()+"\t\t价格："+format.format(book.getPrice()/100.0)+"元");
        }
    }
}
