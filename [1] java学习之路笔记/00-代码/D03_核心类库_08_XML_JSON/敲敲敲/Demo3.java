package D03_核心类库_08_XML_JSON.敲敲敲;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.IOException;

//操作本地文件
public class Demo3 {
    public static void main(String[] args) throws IOException, DocumentException {
        String s = "E:\\hjg_JAVA1_IDEA\\kkb\\src\\D03_核心类库_08_XML_JSON\\敲敲敲\\Demo1.xml";
        FileInputStream fis = new FileInputStream(s);  //1.    获取输入流
        SAXReader sr = new SAXReader();   //2.    创建XML读取工具对象
        Document doc = sr.read(fis);      // 3，通过读取工具, 读取XML文档的输入流 , 并得到文档对象

        /*List<Node> data = doc.selectNodes("//book[@id='1001']//name");// 4，通过文档对象+XPATH查找所有name节点
        for (Node e: data) {
            System.out.println(e.getName());
            System.out.println(e.getText());
        }*/
        Node data = doc.selectSingleNode("//book[@id='1001']//name");
        System.out.println(data.getName());
        System.out.println(data.getText());

        fis.close();
    }
}
