package D03_核心类库_08_XML_JSON.敲敲敲;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

//操作本地文件
public class Demo1 {
    public static void main(String[] args) throws IOException, DocumentException {
        String s = "E:\\hjg_JAVA1_IDEA\\kkb\\src\\D03_核心类库_08_XML_JSON\\敲敲敲\\Demo1.xml";
        FileInputStream fis = new FileInputStream(s);  //1.    获取输入流
        SAXReader sr = new SAXReader();   //2.    创建XML读取工具对象
        Document doc = sr.read(fis);      // 3，通过读取工具, 读取XML文档的输入流 , 并得到文档对象
        Element root = doc.getRootElement();    //4.通过文档对象 , 获取文档的根节点对象
        //System.out.println(root.getName());    // 5.开始解析元素

        /*System.out.println(root.getName());
        Element book = root.element("book");
        System.out.println(book.getText());
        Element name = book.element("name");
        System.out.println(name.getText());*/

        // 5，开始解析元素
        List<Element> list = root.elements();                  // 获取全部节点
        for(int i = 0; i < list.size(); i++) {
            Element book = list.get(i);
            System.out.println(book.attributeValue("id"));  // 获取属性的值
            System.out.println(book.elementText("name"));   // 获取节点文本内容
            System.out.println(book.elementText("info"));   // 获取节点文本内容
            System.out.println("-------------------------");   // 分割线
        }




        fis.close();
    }
}
