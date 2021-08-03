package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Golem extends Hero {
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int glm = boss.getDamage()/5;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                boss.setDamage(boss.getDamage()-glm);
                Golem.super.setHealth(getHealth()-glm);

            }
        }
    }

}
