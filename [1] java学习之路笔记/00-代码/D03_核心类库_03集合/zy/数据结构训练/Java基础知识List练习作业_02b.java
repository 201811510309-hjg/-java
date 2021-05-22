package D03_核心类库_03集合.zy.数据结构训练;

import java.util.Iterator;
import java.util.LinkedList;

public class Java基础知识List练习作业_02b {
    public static void main(String[] args) {
        String[] strs = {"10001", "10086", "12347806666", "45612378901", "10001", "12347806666"};
        LinkedList<String> list = getList(strs);
        //增强型for循环
        System.out.println("------增强型for循环------");
        for(String i : list){
            System.out.println(i);
        }
        //迭代器
        System.out.println("---------迭代器---------");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }

    public static LinkedList<String> getList(String[] strs){
        LinkedList<String> list = new LinkedList<String>();
        for(int i=0; i<strs.length; i++){
            if(list.contains(strs[i])){
                continue;
            }
            list.add(strs[i]);
        }
        return list;
    }
}
