package View;
import java.util.*;
import Service.*;

//初始化界面
public class InitialView {
    public static void initialView()
    {

        Scanner in = new Scanner(System.in);

        // 界面显示
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("                   Worrior VS Devil");
        System.out.println();
        System.out.println("                       1.开始游戏");
        System.out.println("                       2.查看介绍");
        System.out.println("                       0.退出游戏");

        while (true)
        {
            System.out.println("请做出你的选择：");
            int result = in.nextInt();// 接受输入

            switch (result)
            {
                case 1:
                    System.out.println();
                    WeaponView.weaponView();
                    break;
                case 2:
                    System.out.println();
                    IntroduceView.introduceView();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("错误输入！");
                    break;
            }
        }
    }
}
