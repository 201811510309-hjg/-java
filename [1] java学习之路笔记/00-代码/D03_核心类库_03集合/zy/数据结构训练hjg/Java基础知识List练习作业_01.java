package D03_核心类库_03集合.zy.数据结构训练hjg;

/*1、定义一个方法 listTest(ArrayList<String> list, String name)，
        要求返回 name 在 list 里面第一次出 现的索引，如果 name 没出现过返回-1。*/

import java.util.ArrayList;
import java.util.Scanner;

public class Java基础知识List练习作业_01 {
    public static void main(String[] args) {
        ArrayList<String> nameDirectory = new ArrayList<>();
        nameDirectory.add("张三");
        nameDirectory.add("李四");
        nameDirectory.add("王五");
        nameDirectory.add("刘六");

        while(true){
            System.out.println("=======名字检索系统=======");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int index = listTest(nameDirectory,input);
            if(index == -1){
                System.out.println(input + "不在该链表中");
            }else{
                System.out.println(input + "的index为" + index);
            }
        }
    }
    public static int listTest(ArrayList<String> list, String name){
        int len = list.size();
        for(int i = 0; i < len; i++){
            if(list.get(i).equals(name)){
                return i;
            }
        }
        return -1;
    }
}
