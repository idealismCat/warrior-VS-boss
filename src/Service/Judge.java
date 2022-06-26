package Service;

import Dao.Hero;

public class Judge {
    /*
    功能：判定并进行耐力回复
         如果当前耐力值在 0 - 300 的范围内 耐力回复 80 点
                        301 - 400 的范围内 耐力回复 60 点
                        401 - 500 的范围内 耐力回复 50 点
    函数名：judgeAdd
    参数：Hero类 -- hero
    返回值：无
    注：查看Hero类中的 关于 耐力 -- endurance 的相关方法
    * */
    public static void judgeAdd(Hero hero)
    {
        if (0 <= hero.getEndurance() && hero.getEndurance() <= 300) {
            hero.addEndurance(80);
        } else if(301 <= hero.getEndurance() && hero.getEndurance() <= 400) {
            hero.addEndurance(60);
        } else if(401 <= hero.getEndurance() && hero.getEndurance() <= 500) {
            hero.addEndurance(50);
        }
    }
    /*
    功能：根据当前耐力值判定可否使用某一类型的攻击
         如果当前的耐力值不足以使用 某一类型的攻击 则返回 false
         可以使用 就返回 true
    提示：轻击不消耗 耐力, 回复 50 耐力
         重击需要消耗 90 耐力
         附魔攻击需要消耗 120 耐力
         大招需要消耗 200 耐力
    函数名：judgeEndurance
    参数： int -- type -- 攻击类型
    返回值：boolean
    * */
    public static boolean judgeEndurance(int type, Hero hero)
    {

        //..
        int endurance = hero.getEndurance();
        switch (type){
            case 1:
                return true;
            case 2:
                if(endurance>=90)
                    return true;
                break;
            case 3:
                if(endurance>=120)
                    return true;
                break;
            case 4:
                if(endurance>=200)
                    return true;
                break;
            default:
                System.out.println("输入错误");
        }
        return false;
    }


}
