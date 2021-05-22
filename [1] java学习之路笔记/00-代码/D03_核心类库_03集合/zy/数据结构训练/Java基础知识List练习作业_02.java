package D03_核心类库_03集合.zy.数据结构训练;

/*2、已知数组存放一批 QQ 号码,长度 5-11 位，
String[] strs = {"10001","10086","12347806666","45612378901","10001","12347806666"}。
将该数组里面的所有qq号都存放在LinkedList中，
将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。*/


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Java基础知识List练习作业_02 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        String[] strs = {"10001","10086","12347806666","45612378901","10001","12347806666"};
        for(int i = 0;i<strs.length;i++) {
            list.add(strs[i]);
        }
        System.out.println("原号码：");
        for(String str:list)
            System.out.print(str+"  ");
        del(list);
        System.out.println("\n增强for循环打印：");
        for(String str:list)
            System.out.print(str+"  ");
        System.out.println("\n迭代器打印：");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+"  ");
        }
    }

    private static void del(List<String> list) {
        for(int i = 0;i<list.size()-1;i++) {
            for(int j =i+1 ;j<list.size();j++) {
                if(list.get(i) .equals(list.get(j)) ) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }

}

