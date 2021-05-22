package 问题解决.欧拉计划;
//题目3：找出一个合数的最大质数因子
public class e003 {
    public static void main(String[] args) {
        long c = 600851475143l;
        System.out.println(getPrime(c));

    }
    public static long getPrime(long value){
        for (long i=2;i<value;i++){
            long remainder = value %i ;
            if (remainder == 0){
                long vv = value /i ;
                if (isPrime(vv) && !isPrime(i)){
                    return vv;
                }else if (isPrime(vv)&&isPrime(i)){
                    return vv > i ?vv:i;
                }else {
                    return getPrime(vv);
                }
            }
        }return 1;
    }

    public static Boolean isPrime(long value){
        Boolean flag = true;
        for (int i = 2;i < Math.sqrt(value);i++){
            if(value % i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
