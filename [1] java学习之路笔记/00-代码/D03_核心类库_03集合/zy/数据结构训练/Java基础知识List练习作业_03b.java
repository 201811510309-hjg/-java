package D03_核心类库_03集合.zy.数据结构训练;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Java基础知识List练习作业_03b {
    public static void main(String[] args) {
        while(true){
            menu();
        }

    }

    public static int menu(){
        System.out.println("======欢迎来到双色球游戏======");
        System.out.println("请输入相应编号继续游戏：");
        System.out.println("1-开始游戏  2-退出游戏");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = -1;
        try{
            num = Integer.parseInt(input);
        }catch(NumberFormatException e){
            System.out.println("请输入数字");
            return menu();
        }
        if(num < 1 || num > 2){
            System.out.println("请输入正确的数字");
            return menu();
        }

        if(num == 1){
            getball();
        }else{
            System.exit(1);
        }
        return -1;
    }
    public static void getball(){
        System.out.println("正在生成一注双色球号码...");
        System.out.println("生成成功！");
        System.out.println("红色球号码为：");
        LinkedList<Integer> redBall = getRedBall();
        for(Integer i : redBall){
            System.out.print(i);
            System.out.print('\t');
        }
        System.out.println();//换行
        System.out.println("蓝色球号码为：");
        int blueNum = getBlueBall();
        System.out.println(blueNum);
    }
    public static LinkedList<Integer> getRedBall(){
        LinkedList<Integer> red = new LinkedList<>();
        Random random = new Random();
        while(red.size() < 6){
            int code = (int)(1 + Math.random() * 33);
            if(red.contains(code)){
                continue;
            }
            red.push(code);
        }
        return red;
    }

    public static int getBlueBall(){
        Random random = new Random();
        return (int)(1 + Math.random() * 16);
    }

}
