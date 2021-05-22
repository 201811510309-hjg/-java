package D03_核心类库_09枚举_注解_反射.敲敲敲;

import static D03_核心类库_09枚举_注解_反射.敲敲敲.Level3.LOW;

public class Demo01 {
    public static void main(String[] args) {
//        System.out.println(Level.MEDIUM.getLevelValue());
//        System.out.println(Level2.MEDIUM.getLevelValue());
        System.out.println(Level3.MEDIUM.compareTo(Level3.HIGH));//比较
        System.out.println(Level3.MEDIUM.compareTo(LOW));

        //还有一些方法
        System.out.println(Level2.LOW.name());
        System.out.println(Level2.LOW.toString());
        System.out.println(Level2.LOW.ordinal());

        Level2 x = Enum.valueOf(Level2.class,"LOW");
        System.out.println(x.name());

        Level3.LOW.show();
        Level3.MEDIUM.show();
        Level3.HIGH.show();
    }

    //带数值级别比较
    public static void haha(Level2 l){
        switch (l){
            case LOW:break;
            case HIGH:break;

        }
    }
}
