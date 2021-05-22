package D03_核心类库_08_XML_JSON.敲敲敲.Demmo;

import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) {
        // 1，创建Gson对象
        Gson g = new Gson();
        // 2，转换
        Book b = new Book("100", "金苹果", "种苹果");
        String s = g.toJson(b);
        System.out.println(s);
    }

}