package Dao;

public class Weapon {
    private String name = "武器"; // 武器的名字
    private int attackP = 0; // 攻击力 -- attack power

    public Weapon(){}
    // 设置武器的名字
    public void setName(String name){
        this.name = name;
    }
    // 获取武器的名字
    public String getName()
    {
        return name;
    }
    // 设置攻击力
    public void setAttackP(int attackP)
    {
        this.attackP = attackP;
    }
    // 获取攻击力
    public int getAttackP()
    {
        return attackP;
    }
}
