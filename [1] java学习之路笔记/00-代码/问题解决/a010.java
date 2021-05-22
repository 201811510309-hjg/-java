package 问题解决;

public class a010 {
    public static void main(String[] args) {
        String s1 = "str";
        String s2 = "string";
        String s3 = "ing";
        String s4 = s1+s3;
        s1 = s4;
        System.out.println("s1" + ((s1==s2)?"==":"!=")+"s2");
        System.out.println("s1" + ((s1!=s2)?"==":"!=")+"s2");
        System.out.println("s1" + ((s1.equals(s2))?"==":"!=")+"s2");

        System.out.println();
        int a = 1,b= 1;
        for (int c = 0;c<5;c++){
            //if ((++a >2) && (++b >2)){
            if ((++a >2) & (++b >2)){  //a=10 b= 6
                a++;
            }
        }
        System.out.println("a=" +a + " b= "+b);

        System.out.println(8&9);

    }
}
