package adventure.game;

public class Samurai extends GameChar {

    private int id;

    private int damage;
    private int health;
    private int money;
    private String charName;

    public Samurai() {
        super("Samurai", 6, 20, 50, 1);
        this.damage = 6;
        this.health = 20;
        this.money = 50;
        this.charName = "Samurai";
        this.id = 1;
    }
}
