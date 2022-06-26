package View;
import Dao.*;
import Service.*;
import java.util.*;
public class BattleView {

    public static void battleView(Hero hero, Devil devil)
    {
        // 缓慢打印下面的台词
        String[] s = new String[]{"准备好！勇士！\n", " ", "■", " 战斗开始 ", "■", " \n", "恶魔：啊—————！！!感受来自深渊的愤怒吧！！\n", "             记住!", "你的每一步抉择都很重要!\n"};
        for (int i = 0; i < 9; i++)
        {
            try
            {
                System.out.print(s[i]);
                Thread.sleep(500);
            }
            catch (InterruptedException e){}
        }

        Scanner in = new Scanner(System.in);

        while (hero.getHp() > 0 && devil.getHp() > 0)
        {
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.print("                 恶魔HP：" + devil.getHp());
            System.out.println();
            System.out.println();
            System.out.println("-------------------------------------------------------");
            System.out.println("1、轻击(回复50) 2、重击(消耗90) 3、附魔攻击(消耗120) 4、赌狗大招(消耗200)");
            System.out.println("                 勇士HP：" + hero.getHp() );
            System.out.println("                勇士耐力：" + hero.getEndurance() );
            System.out.print("请输入：");

            int result = in.nextInt();


            if (result == 1 || result == 2 || result == 3 || result == 4)
                Round.fightRound(hero, devil, result);

            else{
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException e){}
                System.out.println("请重新输入!");
            }

            // 对战结束后要跳转到 结束界面
            if (hero.getHp() <= 0 && devil.getHp() > 0) // 当英雄 血量 为 0，而 恶魔的血量不为 0 时，英雄被恶魔打倒，失败
            {
                EndView.endViewLose();
                break;
            }
            else if (hero.getHp() > 0 && devil.getHp() <= 0) {
                EndView.endViewSuccess(); // 其余情况：英雄要么与恶魔同归于尽，要么活了下来，只要是杀死了恶魔，都算作胜利
                break;
            }
        }

    }

}
