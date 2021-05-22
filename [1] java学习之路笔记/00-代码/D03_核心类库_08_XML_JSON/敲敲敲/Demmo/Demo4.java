package D03_核心类库_08_XML_JSON.敲敲敲.Demmo;

import com.alibaba.fastjson.JSON;

public class Demo4 {
    public static void main(String[] args) {
        
        Book book = new Book("1002","唐诗三百首","床前明月光，地上鞋一堆。床上我杰哥，喊十块钱一双。");
        //1.    转换
        String json = JSON.toJSONString(book);
        System.out.println(json);
    }
}
