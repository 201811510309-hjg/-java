package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.*;
import java.util.Scanner;


public class Demo8 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入文件的全路径");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        //原文件
        File oldFile = new File(filename);
        //加密文件    加前缀mi-
        File newFile = new File(oldFile.getParent(),"mi-"+oldFile.getName());
        FileInputStream fis = new FileInputStream(oldFile);
        FileOutputStream fos = new FileOutputStream(newFile);
        while (true){
            int b = fis.read();
            if(b==-1){
                break;
            }
            //任何数据^10两次  结果还是其本身   加密解密过程
            fos.write(b^10);

        }
        System.out.println("加密或解密完成");
    }
}
