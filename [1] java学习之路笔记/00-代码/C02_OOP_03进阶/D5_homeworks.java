package C02_OOP_03进阶;

/**
 * @quther hjg
 * @date 2021/1/29 11:01
 **/

public class D5_homeworks {
    public static void main(String[] args) {
//        Book b1 = new Book("凡尔赛文学",50);
//        b1.detail();
        clothes c1 = new clothes();
        c1.show();
        clothes c2 = new clothes();
        c2.show();
        clothes c3 = new clothes();
        c3.show();
        clothes c4 = new clothes();
        c4.show();

    }
}

class Book{
    private String title;
    private int pageNum;

    public Book(String title, int pageNum) {
        this.title = title;
        if (pageNum<200){
            System.out.println("页数太少了！！");
        }
        else
        {this.pageNum = pageNum;}
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    void detail(){
        System.out.println(this.title+"有"+this.pageNum+"页");
        System.out.println();
    }
}

class Emp2{
    private String name;
    private int age;
    private String sex;
    private String love;
    static String company = "啦啦啦";
    static String subject = "Java 学科";

    public Emp2(String name, int age, String sex, String love) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.love = love;
    }

    public Emp2() { }
}

class clothes{
    static int num;
    public clothes() {
        num++;
    }
    void show(){
        System.out.println("衣服"+num+"的序号是："+num);
    }
}