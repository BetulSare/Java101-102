
package adventure.game;

public class Archer extends GameChar {

    private int id;
    private int damage;
    private int health;
    private int money;
    private String charName;

    public Archer() {
        super("Archer", 7, 18, 60, 2);
        this.damage = 7;
        this.health = 18;
        this.money = 40;
        this.charName = "Archer";
        this.id = 2;
    }
}
