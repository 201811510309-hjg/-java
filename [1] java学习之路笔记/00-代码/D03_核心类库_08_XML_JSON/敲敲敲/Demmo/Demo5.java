package D03_核心类库_08_XML_JSON.敲敲敲.Demmo;

import com.alibaba.fastjson.JSON;

public class Demo5 {
    public static void main(String[] args) {
        
        //1.    转换  : {"id":"1002","info":"床前明月光，地上鞋一堆。床上我杰哥，喊十块钱一双。","name":"唐诗三百首"}
//        Book b = JSON.parseObject("{\"id\":\"100\",\"name\":\"金苹果\",\"info\":\"种苹果\"}", Book.class);
//        System.out.println(b.getId());

        String json = "{\"id\":1,\"name\":\"金苹果\",\"author\":\"李伟杰 \",\"info\":\"嘿嘿嘿嘿嘿嘿\",\"price\":198.0}";
        Book book = JSON.parseObject(json, Book.class);
        System.out.println(book);

    }
}
