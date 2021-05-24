package D03_核心类库_04_IO.敲敲敲.代码;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        File e = new File("f://");
        File[] files = e.listFiles(); //得到文件数组
        listFile(files);

    }
    public static void listFile(File[] files){
        if(files!=null && files.length>0){
            for (File file:files) {
                if(file.isFile()){
                    //文件
                    if(file.getName().endsWith(".avi")){
                        if(file.length()>100*1024*1024){ //文件大小
//                            file.delete();
//                            System.out.println(file.getAbsolutePath()+"删除");
                        }
                        System.out.println("找到了一个avi文件"+file.getAbsolutePath());
                    }
                }else {
                    //文件夹
                    File[] files2 = file.listFiles();
                    listFile(files2);
                }
            }
        }

    }
}


