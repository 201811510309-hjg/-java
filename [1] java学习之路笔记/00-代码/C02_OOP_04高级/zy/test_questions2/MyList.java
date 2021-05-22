package C02_OOP_04高级.zy.test_questions2;

public class MyList {
    Object[] element = new Object[5];
    //当前存储数据量
    static int size = 0;

    //增加方法add：可以向数组属性中依次存储Object，数组内容 存满时，实现动态扩容。
    public void add(Object o) {
        element[size] = o;
        size++;

        //动态扩容
        if (element.length == size + 1) {
            Object[] test = new Object[size + 6];
            for (int i = 0;i < element.length;i++) {
                test[i] = element[i];
            }
            element = test;
            System.out.println("扩容完成！总容量更改为:" + element.length);
        }
    }
    //删除方法remove：可以根据下标，从数组属性中删除 Object数据，删除后，数组后续元素需前移。
    public void remove(int a) {
        if (a > size) {
            System.out.println("长度错误！");
            return;
        }
        for (int i = a;i < element.length - 1;i++) {
            element[i] = element[i + 1];
        }
        System.out.println("删除成功！");
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(element[i] + "\t");
        }
        System.out.println();
    }

    //方法重载，删除方法remove：可以根据数据，从数组属性中删除 Object数据，删除后，数组后续元素需前移。
    public void remove(Object o) {
        int i;
        //-1表示没有找到，不然会被赋值为找到的数据的下标
        int flat = -1;
        for (i = 0;i < size;i++) {
            if (this.element[i].equals(o)) {
                flat = i;
                break;
            }
        }
        if (flat != -1){
            remove(i);
        }else {
            System.out.println("数据不存在！");
        }
    }

    //查询方法get：方法传入下标，返回数组中指定下标的数据。 当前存储数据量size：获取当前存储的有效数据长度
    public Object get(int a) {
        if (a >= 0 && a < size)
            return element[a];
        return "下标不正确！";
    }
}


