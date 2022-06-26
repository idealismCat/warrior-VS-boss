package Service;
import Dao.*;
import Dao.Hero;

public class Initialization {
    Hero hero;
    Devil devil;

    public Initialization(){
        Hero temp1 = new Hero();
        Devil temp2 = new Devil();
        hero = temp1;
        devil = temp2;
    }



    /*

    功能 ：设置勇士的武器
    函数名：setHeroWeapon
    参数：i -- int
    返回值：无
    要求：i 为 1，则设置英雄的武器为“大剑”
        i 为 2, 则设置英雄的武器为“魔法书”

        设置英雄的武器 需要用到 Dao中的Hero 类的 setWeapon 方法
    * */
    public void setHeroWeapon(int i)
    {

        switch (i){
            case 1:
                getHero().setWeapon("大剑");
                break;
            case 2:
                getHero().setWeapon("魔法书");
                break;
        }
    }
    /*
    功能：获取 Hero 对象
    函数名：getHero
    参数：无
    返回值：Hero类型
    * */
    public Hero getHero()
    {
        return hero;
    }
    /*
    功能：获取 Devil 对象
    函数名：getDevil
    参数：无
    返回值：Devil 类型
    * */
    public Devil getDevil()
    {
        return devil;
    }

}
