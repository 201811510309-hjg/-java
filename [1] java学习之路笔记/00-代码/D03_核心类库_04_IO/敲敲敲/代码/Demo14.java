package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Demo14 {
    public static void main(String[] args) throws IOException {
        //序列化与反序列化
        Book b = new Book("金苹果","讲述了种植过程");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c://book.hahas"));
        oos.writeObject(b);
        oos.close();

    }
    static class Book implements Serializable {
        private String name;
        private String info;

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
