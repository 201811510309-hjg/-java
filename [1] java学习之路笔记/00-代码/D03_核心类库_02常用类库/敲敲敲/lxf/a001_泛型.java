package D03_核心类库_02常用类库.敲敲敲.lxf;

import java.util.Arrays;

public class a001_泛型 {
    public static void main(String[] args) {
        /**
         * 编写一次模版，可以创建任意类型的ArrayList：
         * 泛型就是定义一种模板
         * 泛型就是编写模板代码来适应任意类型；
         *
         * 泛型的好处是使用时不必对类型进行强制转换，它通过编译器对类型进行检查；
         *
         * 注意泛型的继承关系：可以把ArrayList<Integer>向上转型为List<Integer>（T不能变！），但不能把ArrayList<Integer>向上转型为ArrayList<Number>（T不能变成父类）。
         * 编译器如果能自动推断出泛型类型，就可以省略后面的泛型类型。例如，对于下面的代码：
         *
         * List<Number> list = new ArrayList<Number>();
         * 编译器看到泛型类型List<Number>就可以自动推断出后面的ArrayList<T>的泛型类型必须是ArrayList<Number>，因此，可以把代码简写为：
         *
         * // 可以省略后面的Number，编译器可以自动推断泛型类型：
         * List<Number> list = new ArrayList<>();
         */

        //泛型接口
        /**
         * 除了ArrayList<T>使用了泛型，还可以在接口中使用泛型。例如，Arrays.sort(Object[])可以对任意数组进行排序，但待排序的元素必须实现Comparable<T>这个泛型接口：
         *
         * public interface Comparable<T> {
         *     /**
         *      * 返回负数: 当前实例比参数o小
         *      * 返回0: 当前实例与参数o相等
         *      * 返回正数: 当前实例比参数o大
         *
         *      int compareTo (T o);
         *  }
         *可以直接对String数组进行排序：
            *
            * // sort
            *import java.util.Arrays;
         *
                 *

            public class Main {
                 *

                public static void main(String[] args) {
                 *String[] ss = new String[]{"Orange", "Apple", "Pear"};
                 *Arrays.sort(ss);
                 *System.out.println(Arrays.toString(ss));
                 *
                 *}
                 *
            }
         */
        //这是因为String本身已经实现了Comparable<String>接口。如果换成我们自定义的Person类型试试：
        Person[] ps = new Person[]{
                new Person("Bob",61),
                new Person("Alice",88),
                new Person("Lily",75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
        /**
         * 小结
         * 使用泛型时，把泛型参数<T>替换为需要的class类型，例如：ArrayList<String>，ArrayList<Number>等；
         *
         * 可以省略编译器能自动推断出的类型，例如：List<String> list = new ArrayList<>();；
         *
         * 不指定泛型参数类型时，编译器会给出警告，且只能将<T>视为Object类型；
         *
         * 可以在接口中定义泛型类型，实现此接口的类必须实现正确的泛型类型。
         */

        //编写泛型
        /**
         * public class Pair<T>{
         *     private T first;
         *     private T last;
         *
         *     public Pair(T first, T last) {
         *         this.first = first;
         *         this.last = last;
         *     }
         *
         *     public T getFirst() {
         *         return first;
         *     }
         *
         *     public T getLast() {
         *         return last;
         *     }
         * }
         */

        //编写泛型类时，要特别注意，泛型类型<T>不能用于静态方法
        /**
         * 对于静态方法，我们可以单独改写为“泛型”方法，只需要使用另一个类型即可。对于上面的create()静态方法，我们应该把它改为另一种泛型类型，例如，<K>：
         *
         * public class Pair<T> {
         *     private T first;
         *     private T last;
         *     public Pair(T first, T last) {
         *         this.first = first;
         *         this.last = last;
         *     }
         *     public T getFirst() { ... }
         *     public T getLast() { ... }
         *
         *     // 静态泛型方法应该使用其他类型区分:
         *     public static <K> Pair<K> create(K first, K last) {
         *         return new Pair<K>(first, last);
         *     }
         * }
         * 这样才能清楚地将静态方法的泛型类型和实例类型的泛型类型区分开。
         */

        //多个泛型类型
        /**
         * public class Pair<T, K> {
         *     private T first;
         *     private K last;
         *     public Pair(T first, K last) {
         *         this.first = first;
         *         this.last = last;
         *     }
         *     public T getFirst() { ... }
         *     public K getLast() { ... }
         * }
         * 使用的时候，需要指出两种类型：
         *
         * Pair<String, Integer> p = new Pair<>("test", 123);
         * Java标准库的Map<K, V>就是使用两种泛型类型的例子。它对Key使用一种类型，对Value使用另一种类型。
         */
        /**
         * 小结
         * 编写泛型时，需要定义泛型类型<T>；
         *
         * 静态方法不能引用泛型类型<T>，必须定义其他类型（例如<K>）来实现静态泛型方法；
         *
         * 泛型可以同时定义多种类型，例如Map<K, V>。
         */

//所谓擦拭法是指，虚拟机对泛型其实一无所知，所有的工作都是编译器做的。

        //泛型继承
















    }
}

class Person implements Comparable<Person>{
    String name;
    int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}


