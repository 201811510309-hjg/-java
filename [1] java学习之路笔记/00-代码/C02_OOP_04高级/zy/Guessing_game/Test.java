package C02_OOP_04高级.zy.Guessing_game;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入猜拳比赛回合数: ");
        int maxNumber = sc.nextInt();
        // 回合计数器
        int count = 0;

        // 玩家胜利场数
        int countP = 0;
        // 电脑胜利场数
        int countR = 0;

        while (count < maxNumber) {
            System.out.println("请输入你想出的数字(1.剪刀 2.石头 3.布)：");
            int pNum = sc.nextInt();
            if (pNum > 3 || pNum <= 0) {
                System.out.println("用户输入不正确，输入范围为1-3，请重新输入：");
                pNum = sc.nextInt();
            }
            Player player = new Player(pNum);
            player.print();

            //机器人随机输入1-3
            Random r = new Random();
            int rNum = r.nextInt(3) + 1;
            Robot robot = new Robot(rNum);
            robot.print();

            if (player.getNumber() == robot.getNumber()) {
                System.out.println("双方一致,请重新猜拳");
            } else if (player.getNumber() == 1) {
                if (robot.getNumber() == 2) {
                    countR++;
                    count++;
                    System.out.println("机器人赢"+ countR +"局了！");
                } else if (robot.getNumber() == 3) {
                    countP++;
                    count++;
                    System.out.println("玩家赢"+ countP + "局了！");
                }
            } else if (player.getNumber() == 2) {
                if (robot.getNumber() == 1) {
                    countP++;
                    count++;
                    System.out.println("玩家赢"+ countP + "局了！");
                } else if (robot.getNumber() == 3) {
                    countR++;
                    count++;
                    System.out.println("机器人赢"+ countR +"局了！");
                }
            } else if (player.getNumber() == 3) {
                if (robot.getNumber() == 1) {
                    countR++;
                    count++;
                    System.out.println("机器人赢"+ countR +"局了！");
                } else if (robot.getNumber() == 2) {
                    countP++;
                    count++;
                    System.out.println("玩家赢"+ countP + "局了！");
                }
            }
        }

        //胜场比较
        if (countP == countR) {
            System.out.println("比赛结束,平局");
        } else if (countP < countR) {
            System.out.println("比赛结束,机器人获胜");
        } else {
            System.out.println("比赛结束,玩家获胜");
        }
    }
}
