package D03_核心类库_08_XML_JSON.敲敲敲;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class Demo2 {
    public static void main(String[] args) throws IOException, DocumentException {
        String phone = "15059674648";    // 非本人号码
        // 1，获取到XML资源的输入流
        URL url = new URL("http://apis.juhe.cn/mobile/get?%20phone=" + phone + "&dtype=xml&key=9f3923e8f87f1ea50ed4ec8c39cc9253");
        URLConnection conn = url.openConnection();  // 打开链接
        InputStream is = conn.getInputStream();     // 获得输入流
        // 2，创建XML读取对象
        SAXReader sr = new SAXReader();
        // 3，通过读取对象，读取XML数据，并返回文档对象
        Document doc = sr.read(is);
        // 4，获取根节点
        Element root = doc.getRootElement();
        // 5，解析内容
        String code = root.elementText("resultcode");
        if("200".equals(code)) {
            Element result = root.element("result");
            String province = result.elementText("province");
            String city = result.elementText("city");
            if(province.equals(city)) {
                System.out.println("号码归属地：" + province);
            } else {
                System.out.println("号码归属地：" + province + " " + city);
            }
        } else {
            System.out.println("请输入正确的手机号码");
        }
        is.close();

    }
}
