package adventure.game;

import java.util.Random;
import java.util.Scanner;

public class BattleLoc extends Location {

    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(Monster monster, Player player, String name, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    //bu metot hangi bölgede olduğunu söyler ve combat metodu burada çağırılır
    //kullanıcı girdisi ile savaş ya da kaçış seçilir. kaçan kişi oyunu kaybeder
    public boolean onLocation() {
        Scanner scanner = new Scanner(System.in);

        int monsNumber = randomMonsterNumber();
        System.out.println("You are in " + this.getName());
        System.out.println("Be careful!! " + monsNumber + " " + getMonster().getMonsterName() + "s live there");
        System.out.print("Fight or Escape: ");
        char select = scanner.next().charAt(0);

        if (select == 'F' || select == 'f') {
            if (combat(monsNumber)) {
                System.out.println("You beat all the " + getMonster().getMonsterName() + "s in " + getName());
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    //savaş metodu
    @Override
    //savaş, can azalma ,canavar öldürme, ödül kazanmagibi işlemler burada gerçekleşir
    public boolean combat(int monsNumber) {

        Scanner scanner = new Scanner(System.in);
        int defMonsterHealth = getMonster().getHealth();
        getPlayer().getPlayersInfo();
        System.out.println("The war is beginning");
        for (int i = 1; i <= monsNumber; i++) {
            getMonster().setHealth(defMonsterHealth);

            System.out.println("-----------------------");
            System.out.print(i + ". " + getMonster().getMonsterName() + ": ");
            System.out.println();
            getMonstersInfo();
            char select = ' ';
            double number = randomNumber();

            while (getPlayer().getHealth() > 0 && getMonster().getHealth() > 0) {
                //ilk kimin başlayacağını belirleme
                if (number < 0.5) {
                    //önce kullanıcı başlayacak
                    System.out.println("Hit or Escape:");
                    select = scanner.nextLine().charAt(0);
                    if (select == 'H' || select == 'h') {
                        System.out.println("You are hitting.. :");
                        getMonster().setHealth(getMonster().getHealth() - getPlayer().getTotalDamage());
                        afterHit();
                        if (getMonster().getHealth() > 0) {
                            //canavar saldıracak
                            System.out.println(getMonster().getMonsterName() + " is hitting..");
                            //zırhın bloklamasını monsterın damage sinden çıkarıyoruz
                            int monsDamage = getMonster().getDamage() - getPlayer().getInventory().getArmor().getBlock();

                            if (monsDamage < 0) {
                                monsDamage = 0;
                            }
                            getPlayer().setHealth(getPlayer().getHealth() - monsDamage);
                            afterHit();

                        }
                    }else{
                        
                        //escape seçildiği için canavar saldıracak
                    if (getMonster().getHealth() > 0) {
                            //canavar saldıracak
                            System.out.println("You are running away..");
                            System.out.println(getMonster().getMonsterName() + " is hitting..");
                            //zırhın bloklamasını monsterın damage sinden çıkarıyoruz

                            int monsDamage = getMonster().getDamage() - getPlayer().getInventory().getArmor().getBlock();
                            if (monsDamage < 0) {
                                monsDamage = 0;
                            }
                            getPlayer().setHealth(getPlayer().getHealth() - monsDamage);
                            afterHit();

                            System.out.println("You are hitting.. :");
                            getMonster().setHealth(getMonster().getHealth() - getPlayer().getTotalDamage());
                            afterHit();

                        }
                    
                    }
                } else {//önce canavarın başlayacağı durumu yaz}
                        if (getMonster().getHealth() > 0) {
                            //canavar saldıracak
                            System.out.println(getMonster().getMonsterName() + " is hitting..");
                            //zırhın bloklamasını monsterın damage sinden çıkarıyoruz

                            int monsDamage = getMonster().getDamage() - getPlayer().getInventory().getArmor().getBlock();
                            if (monsDamage < 0) {
                                monsDamage = 0;
                            }
                            getPlayer().setHealth(getPlayer().getHealth() - monsDamage);
                            afterHit();

                            System.out.println("You are hitting.. :");
                            getMonster().setHealth(getMonster().getHealth() - getPlayer().getTotalDamage());
                            afterHit();

                        }
                    }
                }
                if (getPlayer().getHealth() == 0) {
                    return false;
                }
            
        }
        
        //bütün canavarlar öldürülürse bu işlemler gerçekleşir(kazanılan para oyuncuya eklenir) .
        ///bölgeye tekrar girilmemesi için gidilen yerler listesine bölgenin adı eklenir
        getPlayer().setMoney(getPlayer().getMoney() + getMonster().getMoney());
        System.out.println("You earned " + getMonster().getMoney() + " from " + getMonster().getMonsterName());
        System.out.println("Your new balance :" + getPlayer().getMoney());
        String name = "";
        if (this.getName() != null) {
            name = this.getName();
        }
        getPlayer().setVisitedLocations(name);

        return true;
    }

    //bu metot ile savaş esnasında ilk hamleyi kimin yapacağını belirler
    public double randomNumber() {
        Random rnd = new Random();
        double num = Math.random();
        return num;
    }
//oyuncu ve canavarın kalan canlarını gösterir
    public void afterHit() {
        System.out.println("Your health: " + getPlayer().getHealth());
        System.out.println(getMonster().getMonsterName() + "'s health: " + getMonster().getHealth());
    }
//canavarın bilgilerini ekrana yazar
    public void getMonstersInfo() {
        System.out.println(getMonster().getMonsterName() + ":" + "\nDamage: " + getMonster().getDamage() + "\nHealth: " + getMonster().getHealth() + "\nMoney: " + getMonster().getMoney());
    }
//combat metodunda kullanılacak olan canavar sayısını belirler
    public int randomMonsterNumber() {
        Random rnd = new Random();
        return rnd.nextInt(getMaxMonster()) + 1;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

}
