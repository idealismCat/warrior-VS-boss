package Dao;
import Service.*;

public class Devil {
    int hp = 50000; // 默认魔王的血量为 50000

    public Devil(){}

    /*
    功能：获取血量
    函数名：getHp
    参数：无
    返回值：int 类型
    * */
    public int getHp()
    {
        return hp;
    }
    /*
    功能：根据受到伤害减少血量
    函数名：loseHp
    参数：int 类型 -- damage
    返回值: 无
    * */
    public void loseHp(int damage)
    {
        hp -= damage;
    }
    /*
    功能：计算造成的伤害数值
        type 为 1，发动 火焰攻击，造成 700 点伤害，
                2，发动 闪电攻击，造成 900点伤害，
                3，发动 魔王大招，造成 1000 - 2000 范围内的随机伤害
    函数名：makeDamage
    参数：type -- int
    返回值：damage -- int
    注：需要用到 Service 中的 Roll 的 Random 方法
    * */
    public int makeDamage(int type)
    {
        int damage = 0;
        //..
        switch (type){
            case 1:
                damage = 700;
                break;
            case 2:
                damage = 900;
                break;
            case 3:
                Roll r = new Roll();
                int x= r.random(1000,2000);
                damage =x;
                break;
            default:
                break;
        }
        return damage;
    }
}
