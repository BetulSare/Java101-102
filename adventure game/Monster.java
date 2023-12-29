
package adventure.game;

public class Monster {
  private String monsterName;  
  private int id;
  private int damage;
  private int health;
  private int money;

    public Monster(String monsterName, int id, int damage, int health, int money) {
        this.monsterName = monsterName;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
