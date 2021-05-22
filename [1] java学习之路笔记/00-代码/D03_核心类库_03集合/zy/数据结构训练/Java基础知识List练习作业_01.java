package D03_核心类库_03集合.zy.数据结构训练;

/*1、定义一个方法 listTest(ArrayList<String> list, String name)，
        要求返回 name 在 list 里面第一次出 现的索引，如果 name 没出现过返回-1。*/


import java.util.ArrayList;
import java.util.List;

public class Java基础知识List练习作业_01 {

    public static void main(String[] args) {
        List<String> list  = new ArrayList<String>();
        list.add("定义一个方法 listTest(ArrayList<String> list, String name)，");
        System.out.println(list);
        String s = " ";
        int res =  listTest(list,s);
        System.out.println(res);
    }
    public static int listTest(List<String> list, String s) {
        for(int i = 0;i<list.size();i++) {
            if(s == list.get(i)) {
                return i;
            }
        }
        return -1;
    }

}

