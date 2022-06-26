package View;
import Service.*;
import java.util.*;

public class WeaponView {

    /*
      功能：显示武器界面，并接受用户输入选择武器
      函数名：weaponView
      参数：无
      返回值：无
    * */
    public static void weaponView()
    {

        /*
        功能：(1)打印显示： 武器 1：大剑  2：魔法书
             (2)提示用户进行输入并接受输入进行判断：
             (3)如果输入 1，选择大剑 2：选择魔法书
             (4)并给出提示：选择了大剑 / 魔法书 (要求在输入后，延时显示出来)
             需要调用 Service包中的Initialization的setHeroWeapon方法 对武器进行设置
             (5)设置完武器后需要跳转到对战界面
                对战界面需要接受参数，分别是 hero 对象 和 devil 对象
        额外要求：如果用户输入除了 1、2 以外的数字，提示他输入错误

        */

        //..
        Scanner in = new Scanner(System.in);
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("                   武器浏览");
        System.out.println();
        System.out.println("                   1.大剑");
        System.out.println("                  攻击：200    ");
        System.out.println("                  2.魔法书");
        System.out.println("                  攻击：150    ");

        System.out.println();
        System.out.println("<------------------------------------------------------>");
        System.out.println("         请做出你的选择:1.大剑 or 2.魔法书");
        int result = in.nextInt();

        Initialization i = new Initialization();

        switch(result){
            case 1:
                System.out.println("     你选择了大剑作为勇者的武器！！！");
                i.setHeroWeapon(1);
                break;
            case 2:
                System.out.println("     你选择了魔法书作为勇者的武器！！！");
                i.setHeroWeapon(2);
                break;
            default:
                System.out.println("      输入错误，请输入1或2选择武器！！！");
                weaponView();
                break;
        }

        System.out.println();
        System.out.println("<------------------------------------------------------>");
        BattleView.battleView(i.getHero(), i.getDevil());
    }
}
