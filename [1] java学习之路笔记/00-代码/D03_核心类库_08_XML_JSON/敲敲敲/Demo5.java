package D03_核心类库_08_XML_JSON.敲敲敲;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.io.IOException;


public class Demo5 {
    public static void main(String[] args) throws IOException {
        //1. 通过文档帮助器, 创建空的文档对象
        Document doc = DocumentHelper.createDocument();
        //2. 向文档对象中, 加入根节点对象
        Element books = doc.addElement("books");
        //3. 向根节点中 丰富子节点
        for(int i=0;i<3;i++) {
            //向根节点中加入1000个book节点.
            Element book = books.addElement("book");
            //向book节点, 加入id属性
            book.addAttribute("id", 1+i+"");
            //向book节点中加入name和info节点
            Element name = book.addElement("name");
            Element info = book.addElement("info");
            name.setText("苹果"+i); info.setText("哈哈哈"+i);
        }
        //4. 创建文件的输出流
        FileOutputStream fos = new FileOutputStream("books.xml");
        //5. 将文件输出流 , 转换为XML文档输出流
        XMLWriter xw = new XMLWriter(fos);
        //6. 写出XML文档
        xw.write(doc);
        //7. 释放资源
        xw.close();
        System.out.println("代码执行完毕");
    }
}
