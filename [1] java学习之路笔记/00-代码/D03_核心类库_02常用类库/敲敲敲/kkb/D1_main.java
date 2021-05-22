package D03_核心类库_02常用类库.敲敲敲.kkb;
//泛型 提高代码复用
public class D1_main {

    public static void main(String[] args) {
//        D1_Person<String> p = new D1_Person<>();
//        p.setData("123");
//        print("asd");

        //多态 左父右子
        Plate<Apple> p = new Plate<>();

        //上界限定
        Plate<? extends Fruit> T1 = new Plate<Apple>();
        //下界限定
        Plate<? super Apple> T2 = new Plate<Fruit>();



    }

    //泛型方法
//    public static <A> void print(A a){
//        System.out.println(a);
//    }
}

//泛型限定
interface Fruit{}
class Apple implements Fruit{}
class Plate<T extends Fruit>{
    T data;


//class Plate<T extends Fruit,E,W,S,A>{
//    T data;
//}
}
