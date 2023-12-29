
package adventure.game;

public class Knight extends GameChar {

    private int id;
    private int damage;
    private int health;
    private int money;
    private String charName;

    public Knight() {
        super("Knight", 8, 24, 45, 3);
        this.damage = 8;
        this.health = 24;
        this.money = 45;
        this.charName = "Knight";
        this.id = 3;
    }
}
