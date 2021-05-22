package 问题解决;

public class a012 {
    public static void main(String[] args) {
        int[] arry = new int [10];
        setArryValuenlnRand(arry);
        printArry(arry);
        System.out.println();
        getArryMAxValue(arry);
        
    }

    private static int getArryMAxValue(int[] arry) {
        int max = arry[0];
        for (int i = 0;i <arry.length;i++){
            if (arry[i]>max){
                max = arry[i];
            }

        }
        System.out.println(max);
        return max;
    }

    private static void printArry(int[] arry) {
        for (int i = 0;i<arry.length;i++){
            System.out.print(" " + arry[i]);
        }
    }

    private static void setArryValuenlnRand(int[] arry) {
        for (int i = 0;i<arry.length;i++){
            arry[i]= (int)(Math.random()*100);
        }
        
    }


}
