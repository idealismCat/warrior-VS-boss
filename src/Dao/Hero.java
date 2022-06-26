package Dao;
import Service.*;
public class Hero {
    Weapon weapon;// 武器

    int hp = 10000; // 血量 -- 勇士的血量默认初始化成 10000
    int endurance = 500; // 耐力 -- 勇士的耐力默认初始化为 500

    static int tapAttack = 4; // 轻击的伤害倍率
    static int thumpAttack = 8; // 重击的伤害倍率


    public Hero()//构造器
    {
        Weapon temp = new Weapon();
        weapon = temp;
    }

    /*
    功能：减少耐力
    函数名：loseEndurance
    参数：int -- decrease
    返回值：无
    注意：耐力不能低于0点
    * */
    public void loseEndurance(int decrease)
    {
        endurance = endurance - decrease;
        System.out.println("勇士消耗" + decrease + "点耐力");
    }

    /*
    功能：回复耐力
    函数名：addEndurance
    参数：int -- incremental
    返回值：无
    注意：耐力不能超过500点
    * */
    public void addEndurance(int incremental)
    {
        int x = endurance;
        x = x + incremental;
        if(endurance < 500){
            if(x  >= 500)
                endurance = 500;
            else
                endurance = endurance + incremental;
        }
        System.out.println("勇士回复" + incremental + "点耐力");
    }
    // 获取耐力值
    public int getEndurance()
    {
        return endurance;
    }

    /*
    函数名：setWeapon
    参数：String 类型 - weaponName
    返回值: 无
    功能：根据传入的武器名称, 初始化英雄的武器和武器属性

     注: 大剑 -- 攻击力为 200； 魔法书 -- 攻击力为 150
     可能用到的方法：Weapon类中的set/getName 和 set/getAttackP
     */
    public void setWeapon(String weaponName)
    {

        weapon.setName(weaponName);
        if(weaponName.equals("魔法书")){
            weapon.setAttackP(150);
        }else if(weaponName.equals("大剑")){
            weapon.setAttackP(200);
        }
    }
    /*
    功能: 获取武器
    函数名：getWeapon
    参数：无
    返回值：Weapon 类型
    * */
    public Weapon getWeapon()
    {
        return weapon;
    }
    /*
    功能：获取血量
    函数名：getHp
    参数：无
    返回值：int类型
    * */
    public int getHp()
    {
        return hp;
    }
    /*
    功能：根据所受到的伤害减少血量
    函数名：loseHp
    参数：int 类型 - damage 伤害
    返回值：无
    * */
    public void loseHp(int damage)
    {
        hp -= damage;
    }
    /*
    功能：增加血量
    函数名：addHp
    参数：int 类型 - add -- 增加量
    返回值：无
    * */
    public void addHp(int add)
    {
        int x = hp;
        x = x + add;
        if(hp < 10000){
            if(x  >= 10000)
                hp = 10000;
            else
                hp = hp + add;
        }
    }
    /*
    功能 ：计算 武器 轻击 或者 重击 会造成的伤害并返回
          Type 为 1 则判定，轻击；为 2 则判定为 重击
    函数名：weaponMakeDamage
    参数：int 类型 type -- 攻击类型
    返回值: int 类型 -- 最好命名为 damage
    注：伤害计算公式 ：damage = 武器的攻击力 x 轻击/重击的伤害倍率
    * */
    public int weaponmakeDamage(int type)
    {
        int damage = 0;
        //..
        if(type == 1){
            damage = weapon.getAttackP() * tapAttack;
        }
        else if(type == 2){
            damage = weapon.getAttackP() * thumpAttack;
        }else{
            System.out.println("输入错误，请输入数字1：轻击 或者数字2：重击");

        }
        return damage;
    }

    /*
    功能：计算 法术攻击 的伤害并返回
         如果武器是大剑，则造成 攻击力 x 8 的 伤害, 如果武器是魔法书，则造成 攻击力 x 16 的伤害

         计算出伤害后，随机回复 体力， 范围：500 - 1500，打印出 ”附魔攻击回复“ + 体力 + "体力"
    函数名：specialMakeDamage
    参数：无
    返回值：int 类型
    注：Service中的 random方法
    * */
    public int specialMakeDamage()
    {
        int damage = 0;
        //..
        Roll r = new Roll();
        int add = r.random(500, 1500);
        if(weapon.getName().equals("大剑")){
            damage = weapon.getAttackP()*8;
            addHp(add);
            System.out.println("附魔攻击回复" + add + "点体力");
        }else{
            damage = weapon.getAttackP()*16;
            addHp(add);
            System.out.println("附魔攻击回复" + add + "点体力");
        }
        //..
        return damage;
    }

    /*
    功能：计算 大招 的伤害并返回
          随机 造成 2000 - 6000 范围内的伤害
              然后进入 下面的判定：
    函数名：dazhaoDamage
    参数: 无
    返回值：int 类型
    注：需要用到 Service 中的 Roll 的 random 方法
    * */
    public int dazhaoDamage()
    {
        int damage = 0;
        //..
        Roll roll = new Roll();
        int x = roll.random(2000, 6000);
        damage = x;
        return damage;
    }
}
