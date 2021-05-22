package D03_核心类库_08_XML_JSON.敲敲敲.Demmo;

import com.google.gson.Gson;

public class Demo2 {
    public static void main(String[] args) {
        // 1，创建Gson对象
        Gson g = new Gson();
        // 2，转换{"id":"100","name":"金苹果","info":"种苹果"}为对象
        Book b = g.fromJson("{\"id\":\"100\",\"name\":\"金苹果\",\"info\":\"种苹果\"}", Book.class);
        System.out.println(b);
    }

}