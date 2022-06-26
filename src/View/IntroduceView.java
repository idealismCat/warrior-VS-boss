package View;

import java.util.Scanner;

public class IntroduceView {
    public static void introduceView()
    {
        System.out.println("这里是介绍界面");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("法西大陆作为一个魔物与人类共存的大陆，在神灵的庇佑下，虽然两者之间纷争不断，");
        System.out.println("但处于一种微妙的平衡，不恰当的以人与蟑螂的关系类比，互看不顺眼但是都拿对方没办法。");
        System.out.println();
        System.out.println("但是这种微妙的平衡被魔王的出现打破了。");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        System.out.println();
        System.out.println("魔物本是心高气傲的种群，没有魔物会对另外一个魔物服从，哪怕是神灵他们也敢亵渎。突然");
        System.out.println("一天，魔王诞生了，以绝对的实力把魔物们给打服了，甚至以强大的统领能力将大部分的魔物");
        System.out.println("统治起来，建立起了国家，他指挥魔物一步步攻陷人类的城池。本来相比魔物无论肉体还是法");
        System.out.println("力都要弱，只能靠群体和智慧取胜的人类，面对昔日全凭本能如今却被指挥得像模像样的魔物");
        System.out.println("兵，自然被打得节节败退。");
        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        System.out.println("神灵自然有插手干扰魔物占领世界的进程，但是他们需要庇佑的世界也不是只有法西大陆，不");
        System.out.println("可能事事亲力亲为，于是作为神灵的代言人，勇者应运而生。");
        System.out.println();
        System.out.println("勇者被赋予了神之力，不仅对法力的亲和力提升，据说甚至能轻易地借用神灵的力量！这样就");
        System.out.println("能去打败那群可恶的魔物，收回属于我们人类的领土了！");
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("这是勇者拯救世界的故事，这是一位冒险者的征程，你，准备好了吗？？？");
        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("                                             游戏规则：");
        System.out.println("该游戏是一个回合制的游戏，勇者需要通过选择游戏中所给的装备和技能对魔王采取攻击，不同武器具有不同的攻击力，不同的攻击方式");
        System.out.println("所产生的伤害不同。所能产生的伤害需要玩家自行进行摸索，注意，不同的攻击方式需要不同的耐力消耗，虽然会有一定耐力回复但记住注意控制自己的耐力哦！！！");

        System.out.println();
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("                       1.开始游戏");
        System.out.println("                       0.返回初始界面");

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("请做出你的选择：");
            int select = in.nextInt();// 接受输入

            switch (select) {
                case 1:
                    WeaponView.weaponView();
                    break;
                case 0:
                    InitialView.initialView();
                    break;
                default:
                    System.out.println("输入错误，请重新选择");
            }
        }
    }
}
