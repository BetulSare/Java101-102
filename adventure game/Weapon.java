package adventure.game;

public class Weapon {

    private int damage;
    private int id;
    private int money;
    private String name;

    public Weapon(int damage, int id, int money, String name) {
        this.damage = damage;
        this.id = id;
        this.money = money;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Weapon[] weaponLists() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(2, 1, 5, "Pistol");
        weaponList[1] = new Weapon(3, 2, 15, "SworPid");
        weaponList[2] = new Weapon(7, 3, 25, "Rifle");
        return weaponList;
    }

}
