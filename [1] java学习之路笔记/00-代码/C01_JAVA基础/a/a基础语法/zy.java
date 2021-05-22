package C01_JAVA基础.a.a基础语法;

public class zy {
    public static void main(String[] args) {
        System.out.println("作业1");
        one();
        System.out.println();
        System.out.println("作业2");
        two();
        System.out.println();
        System.out.println("作业3");
        three1();
        three2();
        three3();
        System.out.println();
        System.out.println("作业4");
        four();

    }

    /**
     * 1. 定义一个整型变量并赋任意五位正整数作为初始值，判断它是不是五位 回文数
     * （五位回文数：个位与万位相同，十位与千位相同，例如：12321）：
     */
    public static void one(){
        int a = 12321;
        int b = (int)Math.log10(a)+1;
        if (b == 5) {
            String c1 = Integer.toString(a);
            String c2 = new StringBuffer(c1).reverse().toString();
            if(c1.equals(c2)){
                System.out.println("a="+a);
                System.out.println("它是一个5位的回文数");
            }else{ System.out.println("它不是一个5位的回文数");}
        }else{System.out.println("它不是一个5位的回文数");}
    }

    /**
     * 2. 定义一个整型变量并赋任意五位正整数作为初始值，输出各位数字之和
     * （例如：12345 各位之和是：1+2+3+4+5 。也就是 15）
     */
    public static void two(){
        int a = 12345;
        System.out.println("a="+a);
        int b = 0;
        while(a>0){
            b+=a%10;
            a=a/10;
        }
        System.out.println("12345 各位之和是：1+2+3+4+5="+b);
    }

    /**
     * 3. 定义整型变量 a、b，写出将 a、b 两个变量值进行互换的程序 （要求不能使用第三个变量）
     */
    private static void three1() {
        //方法1
        int x = 5,y=10;
        System.out.println("x="+x + "\t" + "y="+y);
        int temp = x ; //定义第三临时变量temp并提取x值
        x = y;//把y的值赋给x
        y = temp;//然后把临时变量temp值赋给y
        System.out.println("x="+x+"\t"+"y="+y+"\n");
    }
    private static void three2() {
        //方法2
        int x = 5,y=10;
        System.out.println("x="+x + "\t" + "y="+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x="+x+"\t"+"y="+y+"\n");

    }
    private static void three3() {
        //方法3 : 想到逻辑运算符中的 异或
        int a=3,b=5;
        System.out.println("a=" + a + "；b=" + b);
        //按位异或的运算规则--异：1
        /**
         *     a    :0011
         *     b    :0101
         * a^b  :0110
         */
        a = a ^ b; //0110
        /**
         *     a     :0110
         *     b     :0101
         *     a^b  :0011
         */
        b = a ^ b; //0011
        /**
         *     a     :0110
         *     b     :0011
         *     a^b  :0101
         */
        a = a ^ b; //0101
        System.out.println("a=" + a + "；b=" + b);
    }

    /**
     * 4. 请写出一段遵守编码规范的 Hello World 代码 （注意，注释必须有，也要遵守规范）
     */
    private static void four() {
        System.out.println("Hello World");
    }
}
