package D03_核心类库_03集合.敲敲敲.liaoxuefen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//List的特点
public class a001_Arraylist {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("1234");// 允许重复添加元素
        list.add("1234");
        list.add(null);  //List还允许添加null
        System.out.println(list.size());*/

        //List<Integer> list = List.of(1,2,3,4,5,null);
//List.of()方法不接受null值，如果传入null，会抛出NullPointerException异常。

        //List<String> list = List.of("apple","pear","banana");
        /*for (int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }*/

        //迭代器 Iterator
        //通过Iterator遍历List永远是最高效的方式。
        /*for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }*/

        //Java的for each循环本身就可以帮我们使用Iterator遍历。把上面的代码再改写如下：
        /*for (String s: list) {
            System.out.println(s);
        }*/
/**
 * 只要实现了Iterable接口的集合类都可以直接用for each循环来遍历，
 * Java编译器本身并不知道如何遍历集合对象，但它会自动把for each循环
 * 变成Iterator的调用，原因就在于Iterable接口定义了
 * 一个Iterator<E> iterator()方法，强迫集合类必须返回一个Iterator实例。
 */
        //List和Array转换 有三种方法
        //第一种是调用toArray()方法直接返回一个Object[]数组：
        /*List<String> list = List.of("apple","pear","banana");
        Object[] array = list.toArray();
        for (Object s:array
             ) {
            System.out.println(s);
        }*/
        //这种方法会丢失类型信息，所以实际应用很少。
        //第二种方式是给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中：
        /*List<Integer> list = List.of(12,34,56);
        Integer[] array = list.toArray(new Integer[3]);
        for (Object s:array
        ) {
            System.out.println(s);
        }*/
        //注意到这个toArray(T[])方法的泛型参数<T>并不是List接口定义的泛型参数<E>，所以，我们实际上可以传入其他类型的数组，例如我们传入Number类型的数组，返回的仍然是Number类型：
        /*Number[] array2 = list.toArray(new Number[3]);
        for (Number n : array2) {
            System.out.println(n);
        }*/
//最后一种更简洁的写法是通过List接口定义的T[] toArray(IntFunction<T[]> generator)方法：
        /*List<Integer> list = List.of(12,34,56);
        Integer[] array = list.toArray(Integer[]::new); //函数式写法
        for (Number n : array) {
            System.out.println(n);
        }*/
        //反过来，把Array变为List就简单多了，通过List.of(T...)方法最简单：
        /*Integer[] array = { 1, 2, 3 };
        List<Integer> list = List.of(array);
        for (Integer n: list
             ) {
            System.out.println(n);
        }*/
        /**
         * 对于JDK 11之前的版本，可以使用Arrays.asList(T...)方法把数组转换成List。
         *
         * 要注意的是，返回的List不一定就是ArrayList或者LinkedList，因为List只是一个接口，如果我们调用List.of()，它返回的是一个只读List：
         */
//        List<Integer> list = List.of(12, 34, 56);
//        list.add(999); // UnsupportedOperationException
//对只读List调用add()、remove()方法会抛出UnsupportedOperationException。


        //练习
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

     static int findMissingNumber(int start, int end, List<Integer> list) {
        while (list.contains(start)) {
            start++;
        }
        return start;
    }

/**
 * 小结
 * List是按索引顺序访问的长度可变的有序表，优先使用ArrayList而不是LinkedList；
 *
 * 可以直接使用for each遍历List；
 *
 * List可以和Array相互转换。
 */













}

