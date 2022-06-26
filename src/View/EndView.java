package View;

import java.util.Scanner;

public class EndView {
    public static void endViewSuccess() {
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println();
        System.out.println("                       游戏结束");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println();
        System.out.println("                    恭喜你取得胜利！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println();
        System.out.println();
        System.out.println("                     是否开始新的征程？？？");
        System.out.println("                   1.开始新征程 or 2.结束游戏");
        System.out.println("请做出你的选择：");
        Scanner in = new Scanner(System.in);
        int select = in.nextInt();
        System.out.println("<------------------------------------------------------>");
        switch (select) {
            case 1:
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

                InitialView.initialView();
            case 2:
                System.exit(0);
        }
    }

    public static void endViewLose() {
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println();
        System.out.println("                         游戏结束");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println();
        System.out.println("                    很遗憾失败了，再接再励吧");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println();
        System.out.println();
        System.out.println("                   1.重新挑战 or 2.返回初始界面");
        System.out.println("请做出你的选择：");
        Scanner in = new Scanner(System.in);
        int select = in.nextInt();
        System.out.println("<------------------------------------------------------>");
        switch (select) {
            case 1:
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

                WeaponView.weaponView();
            case 2:
                InitialView.initialView();
        }
    }
}
