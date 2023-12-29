package adventure.game;

import java.util.Scanner;

public class Player {

    private int originalHealth;
    private int id;
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String playerName;
    public Scanner scan = new Scanner(System.in);
    private Inventory ınventory;
    private String visitedLocations;
    

    
    public Player(String playerName) {
        this.playerName = playerName;
        this.ınventory = new Inventory();
        this.damage=0;
    }

   //oyuncunun canını fullemek için tutulur
    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public String getVisitedLocations() {
        
        return visitedLocations;
    }

    public void setVisitedLocations(String visitedLoc ) {
        this.visitedLocations += "  "+visitedLoc;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //oyuncunun bilgilerini ekrana yazdırmak için
    public void getPlayersInfo(){
    System.out.println("Weapon: "+getInventory().getWeapon().getName()+
                    "\tArmor : "+getInventory().getArmor().getName()+
                    "\tBlock: "+getInventory().getArmor().getBlock()+
                    "\tDamage: "+getDamage()+"\tHealth: "+getHealth()+"\tMoney: "+getMoney());
    
        System.out.println("-------Inventory------- ");
        if(getInventory().isFireWood()){System.out.println("Firewood");}
        if(getInventory().isWater()){System.out.println("Water");}
        if(getInventory().isFood()){System.out.println("Food");}
        System.out.println();
        System.out.println();
    }
    
    public Inventory getInventory() {
        return ınventory;
    }

    public void setInventory(Inventory ınventory) {
        this.ınventory = ınventory;
    }

    public int getTotalDamage() {
        return this.damage + getInventory().getWeapon().getDamage();

    }public void setTotalDamage() {
        this.damage += getInventory().getWeapon().getDamage();

    }

    public int getDamage() {
        return this.damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getCharName() {
        return charName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    //seçilen karakterin özelliklerini oyuncunun özelliklerine eşitler
    public void inItPlayer(GameChar gamechar) {
        this.charName = gamechar.getCharName();
        this.damage=gamechar.getDamage();
        this.health = gamechar.getHealth();
        this.money = gamechar.getMoney();
        this.id = gamechar.getId();
        this.originalHealth=gamechar.getHealth();
    }

    //karakterleri gösterip seçtirir
    public void selectChar() {
        Scanner scan = new Scanner(System.in);
        Samurai s=new Samurai();
        Archer a=new Archer();
        Knight k=new Knight();
        System.out.println("---------------------------------------");
        System.out.println("CHARACTERS: \n1-"+s.getCharName()+":\tDamage="+s.getDamage()+",\tHealth="+s.getHealth()+",\tMoney="+s.getMoney()
                + "\n2-"+a.getCharName()+":\tDamage="+a.getDamage()+",\tHealth="+a.getHealth()+",\tMoney="+a.getMoney()
                + " \n3-"+k.getCharName()+":\tDamage="+k.getDamage()+",\tHealth="+k.getHealth()+",\tMoney="+k.getMoney());

        System.out.println("---------------------------------------");
        System.out.print("Please select a character: ");
        int id = scan.nextInt();

        switch (id) {
            case 1:
                inItPlayer(new Samurai());
                break;
            case 2:
                inItPlayer(new Archer());
                break;
            case 3:
                inItPlayer(new Knight());
                break;
            default:
                inItPlayer(new Samurai());
                break;

        }
        System.out.println("Character:" + this.charName + " ID:" + this.id + " Damage:" + this.damage + " Health:" + this.health + " Money:" + this.money);
    }
}
