package Service;
import Dao.*;
import Service.*;
public class Round
{
    public static void fightRound(Hero hero, Devil devil, int type)
    {

        /*
        功能：做如下判定并实施对应操作：
             首先，预先进行耐力判定：
                  （1）如果判定 当前耐力值并不足以使用 对应攻击，则打印 “无法进行” + 对应攻击类型，并跳过（2）阶段；
                       注意: type 为 1，对应轻击
                             type 为 2，对应重击
                             type 为 3，对应附魔攻击
                             type 为 4 对应大招
                      （2）如果判定 当前耐力值可以使用 对应攻击，则进入 下面的阶段：
                       1：勇士使用了轻击 给勇者进行耐力回复，给 devil 扣除血量 并且打印出来使用的攻击类型和造成的伤害
                       2：勇士使用了重击 给勇者进行耐力扣除,给 devil 扣除血量 并且打印出来使用的攻击类型和造成的伤害
                       3：勇士使用了附魔攻击 给勇者进行耐力扣除,给 devil 扣除血量 并且打印出来使用的攻击类型和造成的伤害
                       4：勇士使用了赌狗大招 给勇者进行耐力扣除,给 devil 扣除血量 并且打印出来使用的攻击类型和造成的伤害

            注: 给 devil 造成伤害以及扣除血量，可见Hero类 和 Devil类中的 对应方法
                耐力判定相关 可见 Service 中 的 judge 类的 judgeEndurance

        * */
        if (hero.getHp() > 0 && devil.getHp() > 0) {
            if (Judge.judgeEndurance(type, hero) == true) {
                switch (type) {
                    case 1:
                        System.out.println("勇者使用了轻击!");
                        int qingjiDamage = hero.weaponmakeDamage(type);
                        devil.loseHp(qingjiDamage);
                        System.out.println("勇士使用" + hero.getWeapon().getName() + "发动轻击对魔王造成了" + qingjiDamage + "点伤害");
                        hero.addEndurance(50);
                        break;
                    case 2:
                        System.out.println("勇者使用了重击!");
                        int zhongjiDamage = hero.weaponmakeDamage(type);
                        devil.loseHp(zhongjiDamage);
                        System.out.println("勇士使用" + hero.getWeapon().getName() + "发动重击对魔王造成了" + zhongjiDamage + "点伤害");
                        hero.loseEndurance(90);
                        break;
                    case 3:
                        System.out.println("勇者使用了附魔攻击!");
                        int mofaDamage = hero.specialMakeDamage();
                        devil.loseHp(mofaDamage);
                        System.out.println("勇士使用" + hero.getWeapon().getName() + "发动魔法攻击对魔王造成了" + mofaDamage + "点伤害");
                        hero.loseEndurance(120);
                        break;
                    case 4:
                        System.out.println("勇者使用了赌狗大招!");
                        int dazhaoDamage = hero.dazhaoDamage();
                        devil.loseHp(dazhaoDamage);
                        System.out.println("勇士使用大招对魔王造成了" + dazhaoDamage + "点伤害");
                        hero.loseEndurance(200);
                        break;
                }
            } else {
                System.out.println("勇者现在无法使用此攻击!");
                System.out.println("小心！！魔王出招了！");
            }
            // 功能：判定并进行耐力回复
            Judge.judgeAdd(hero);
        }

        /*
        功能：从 魔王攻击发生器 产生随机数，给type2，
             做以下判定并实施对应操作：
             如果 是 1：使用 火焰攻击 给hero扣除血量 并且打印出来使用的攻击类型和造成的伤害
                    2：使用 闪电攻击 给hero扣除血量 并且打印出来
                    3：使用 魔王大招 给hero扣除血量 并且打印出来
              注：产生随机数，可见 Service 的 Roll 中的 devilrandom 方法
                  给hero造成伤害以及扣除血量，可见Hero类 和 Devil类中的 对应方法
        * */
        int type2 = Roll.devilRandom(); // 这里要 给 type2 赋上 随机数
        //..
        if (devil.getHp() > 0 && hero.getHp() > 0) {
            switch (type2) {
                case 1:
                    int devilDamage = devil.makeDamage(type2);
                    System.out.println("魔王使用火焰攻击给英雄造成" + devilDamage + "点伤害");
                    hero.loseHp(devilDamage);
                    break;
                case 2:
                    int devilDamage2 = devil.makeDamage(type2);
                    System.out.println("魔王使用闪电攻击给英雄造成" + devilDamage2 + "点伤害");
                    hero.loseHp(devilDamage2);
                    break;
                case 3:
                    int devilDamage3 = devil.makeDamage(type2);
                    System.out.println("魔王使用魔王大招给英雄造成" + devilDamage3 + "点伤害");
                    hero.loseHp(devilDamage3);
                    break;
            }
        }
    }
}
