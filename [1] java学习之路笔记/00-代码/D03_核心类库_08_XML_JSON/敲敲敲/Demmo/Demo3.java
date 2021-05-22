package D03_核心类库_08_XML_JSON.敲敲敲.Demmo;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        // 1，创建Gson对象
        Gson g = new Gson();
        // 2，转换{"id":"100","name":"金苹果","info":"种苹果","page":["锄禾日当午","汗滴禾下土","谁知盘中餐","粒粒皆辛苦"]}为对象
        HashMap b = g.fromJson("{\"id\":\"100\",\"name\":\"金苹果\",\"info\":\"种苹果\",\"page\":[\"锄禾日当午\",\"汗滴禾下土\",\"谁知盘中餐\",\"粒粒皆辛苦\"]}", HashMap.class);
        System.out.println(b.get("page").getClass());

        List page = (List)b.get("page");
        System.out.println(page.get(1));
    }

}