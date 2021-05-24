package D03_核心类库_04_IO.敲敲敲.代码;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

//文件过滤器 匿名内部类
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File e = new File("e:\\");
        listFiles(e);
    }
    public static void listFiles(File file){
        //1.    创建一个过滤器 并描述规则
        /*FileFilter filter = new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".md") || pathname.isDirectory())
                    return true;
                return false;
            }
        };*/


        //2.    通过文件获取子文件夹
        File[] files = file.listFiles(new FileFilter(){  //好用的格式
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".md") || pathname.isDirectory())
                    return true;
                return false;
            }
        });
        if (files!=null && files.length>0)
        for (File f:files) {
            if (f.isDirectory()){
                listFiles(f);
            }else {
                System.out.println("发现一个MD ："+f.getAbsolutePath());
            }
        }
    }

    /*static  class MDFilFilter implements FileFilter{
        @Override
        public boolean accept(File pathname) {
            if (pathname.getName().endsWith(".md") || pathname.isDirectory())
                return true;
            return false;
        }
    }*/
}
