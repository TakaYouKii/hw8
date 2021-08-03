package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int w = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(getHealth()+this.getHealth());
                this.setHealth(0);
                System.out.println("Witcher dead" + heroes[i]);
                break;
            }
        }
    }

}
