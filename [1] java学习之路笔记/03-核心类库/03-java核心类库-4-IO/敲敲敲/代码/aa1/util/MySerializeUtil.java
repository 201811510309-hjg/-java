package D03_核心类库_04_IO.敲敲敲.代码.aa1.util;

import java.io.*;

/*** 序列化和反序列化的工具类 */
public class MySerializeUtil {
    /**
     * 将对象序列化到指定文件中
     * @param obj
     * @param fileName
     * @throws IOException
     */
    public static void mySerialize(Object obj , String fileName) throws IOException {
        OutputStream out = new FileOutputStream(fileName);
        ObjectOutputStream objOut=new ObjectOutputStream(out);
        objOut.writeObject(obj);
        objOut.close();
    }

    /**
     * 从指定文件中反序列化对象
     * @param fileName
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object myDeserialize(String fileName) throws IOException, ClassNotFoundException {
        InputStream in=new FileInputStream(fileName);
        ObjectInputStream objIn=new ObjectInputStream(in);
        Object obj=objIn.readObject();
        return obj;
    }

}
