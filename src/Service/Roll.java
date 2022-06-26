package Service;
import java.util.Random;

public class Roll {

    public Roll()
    {}
    /*
    功能：根据 所给的 起始值 和 终止值
         产生在这个范围里的 随机数
    函数名：random
    参数：int 类型 -- begin、end
    返回值：int 类型 -- R
    * */

    public static int random(int begin, int end)
    {
        int R = 0;
        //..

        R = new Random().nextInt(end - begin) + begin;

        return R;
    }
    /*
    devil随机攻击发生器
    功能：
    70% 概率 做出 1：火焰攻击
    20% 概率 做出 2：闪电攻击
    10% 概率 做出 3：魔王大招
    参数：无
    返回值：int 类型 -- type -- 攻击类型

    注：会被Service里的Round的 fightround 方法 中的 type2 接收
    * */
    public static int devilRandom() {

        //..
        int randomInt = random(1, 101);
        if (randomInt <= 10) {
            return 3;
        } else if (randomInt <= 20) {
            return 2;
        } else {
           return 1;
        }
    }
}
