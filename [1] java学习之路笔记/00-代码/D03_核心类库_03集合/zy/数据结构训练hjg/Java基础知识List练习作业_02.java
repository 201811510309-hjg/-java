package D03_核心类库_03集合.zy.数据结构训练hjg;

/*2、已知数组存放一批 QQ 号码,长度 5-11 位，
String[] strs = {"10001","10086","12347806666","45612378901","10001","12347806666"}。
将该数组里面的所有qq号都存放在 LinkedList 中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。*/

import java.util.HashSet;
import java.util.Set;

public class Java基础知识List练习作业_02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(); // 实例化Set接口对象
        String[] strs = {"10001","10086","12347806666","45612378901","10001","12347806666"};
        for(int i = 0;i<strs.length;i++) {
            set.add(strs[i]);
        }
        //遍历
        for (String name : set) { System.out.print(name+" "); }


    }
}
