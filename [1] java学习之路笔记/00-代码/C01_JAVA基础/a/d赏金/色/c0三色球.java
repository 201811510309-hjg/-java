package C01_JAVA基础.a.d赏金.色;

/**
 * 三色球 问题。有红、黄、绿三种颜色的球，其中红球3个，黄球3个，绿球6个。
 *
 * 现将这12个球混放在一个盒子里，从中任意摸出8个球，编程计算摸出球的各种颜色搭配。
 */
public class c0三色球 {

    public static void main(String[] args) {
        int red , white , black ;
        for(red=0 ; red<=3 ; red++)                 //红球：0~3
            for(white=0 ; white<=3 ; white++){      //白球：0~3

                for (black = 0;black <=6;black ++){    //可以加
                    if (red +white +black == 8){
                        System.out.println("红球："+red+" 个，白球"+white+"个，黑球："+black+"个");
                    }
                }

                //可以减
                black = 8-red-white ;               //黑球小于等于6
                if(black <= 6){
                    System.out.println("红球："+red+" 个，白球"+white+"个，黑球："+black+"个");
                }
            }
    }
}
/*public static void main(String[] args) {
        int i = 0;

        int j = 0;

        int k = 0;

        int temp=0;

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++) {
                for (k = 0; k <= 6; k++) {
                    if (i + j + k == 8) {
                        temp++;

                        printfQiu(i, j, k);

                    }

                }

            }

        }

        System.out.println(temp);

    }
    public static void printfQiu(int i, int j, int k) {
        for (int l = 0; l < i; l++) {
            System.out.print("红");

        }

        for (int l = 0; l < j; l++) {
            System.out.print("黄");

        }

        for (int l = 0; l < k; l++) {
            System.out.print("蓝");

        }

        System.out.println();

    }*/

