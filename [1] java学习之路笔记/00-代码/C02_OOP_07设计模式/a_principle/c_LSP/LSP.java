package C02_OOP_07设计模式.a_principle.c_LSP;

import java.util.HashMap;
import java.util.Map;

public class LSP {
    //当子类覆盖或者实现父类的方法时，方法的输入参数要比父类的方法输入的参数更宽松
    class Parent{
        public void fun(HashMap map){
            System.out.println("父类被执行...");
        }
    }
    class Sub extends Parent{
        public void fun(Map map){
            System.out.println("子类被执行....");
        }
    }

    public static void main(String[] args) {
        System.out.println("父类运行的结果：");
        // 内部 先new 外部类的名字
        LSP lsp = new LSP();
        Parent a = lsp.new Parent();
        HashMap<Object,Object> hashMap = new HashMap<>();
        a.fun(hashMap);

        //父类存在的地方可以用子类匪患
        //子类替换父类
        System.out.println("子类替换父类运行的结果：");
        Sub b = lsp.new Sub();
        b.fun(hashMap);
    }

}
