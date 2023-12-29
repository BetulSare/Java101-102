package adventure.game;

public class Armor {

    private String name;
    private int id;
    private int price;
    private int block;

    public Armor(String name, int id, int price, int block) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public static Armor[] armorLİst() {
        Armor[] a = new Armor[3];
        a[0] = new Armor("Light", 1, 15, 1);
        a[1] = new Armor("Medium", 2, 25, 3);
        a[2] = new Armor("Heavy", 3, 40, 5);

        return a;
    }
}
