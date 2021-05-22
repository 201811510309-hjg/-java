package D03_核心类库_03集合.敲敲敲.kkb;

import java.util.LinkedList;

public class D03_LinkedList  {
    public static void main(String[] args) {
        //LinkedList : 使用的是双向链表结构，对于增加删除快，查找慢
        //栈 队列 单端 双端  业务需求
        //add   remove  get
        LinkedList<Integer> data = new LinkedList<>();
//        data.addFirst(100);
//        data.addFirst(200);
//        Integer i = data.removeFirst();
//        System.out.println(i);

        //；压栈
        data.push(123);
        data.push(456);
        //弹栈
        Integer o = data.pop();
        System.out.println(o);
    }
}
