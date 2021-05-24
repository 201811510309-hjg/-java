package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.*;

public class Demo14 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化与反序列化   java官方想放弃 阿里有用
        Book b = new Book("金苹果","讲述了种植过程");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f://book.hahas"));
        oos.writeObject(b);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f://book.hahas"));
        Book o = (Book)  ois.readObject(); //添加了 ClassNotFoundException
        System.out.println(o.getInfo());


    }
    class person implements Serializable{
        private String name;
        private int age;
    }

    static class Book  implements Serializable{ //标记接口 implements Serializable
        private String name;
        private String info;
        private person p; //包含类也要 implements Serializable 不然会报错 ，常用的集合类型自己有 implements Serializable

        public Book(String name, String info) {
            this.name = name;
            this.info = info;
        }

        public Book() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", info='" + info + '\'' +
                    '}';
        }
    }
}
