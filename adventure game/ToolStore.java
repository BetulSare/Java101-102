package adventure.game;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Tool Store");

    }

    //normalLoc'taki onLocation metodu override edilerek düzenlenir
    //onLocation metodunda kullanıcıdan bir işlem yapmasını isteriz 
    //seçtiği işlemlere göre metotlar çağırarak bu işlemleri gerçekleştiririz
    @Override
    public boolean onLocation() {
        System.out.println("-----Welcome to tool store!-----");
        System.out.println("Please choose a operation: \n1-Weapons \n2-Armors \n3-Exit ");
        int operation = Location.scan.nextInt();

        while (operation < 1 || operation > 3) {
            System.out.println("You entered an invalid value.Try again..");
            operation = Location.scan.nextInt();

        }
        switch (operation) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("See you again");
                break;

        }
        return true;
    }

    //silah listesini gösterip seçtirir
    //eğer yeterli para varsa seçilen silahın adı ve hasarı oyuncunun hasarı ve silah adına eşitlenir
    public void printWeapon() {
        
            
        System.out.println("-----Weapons-----");
        for (Weapon w : Weapon.weaponLists()) {
            System.out.println(w.getId() + "- " + w.getName() + " Price:" + w.getMoney() + " Damage:" + w.getDamage());
        }
        if(!getPlayer().getInventory().getWeapon().getName().equals("Fist")){
            System.out.println("You have a "+getPlayer().getInventory().getWeapon().getName()+" .If you want you can change it. ");
            getPlayer().setDamage(getPlayer().getDamage()-getPlayer().getInventory().getWeapon().getDamage());
        }
        System.out.println("Select a weapon:");
        int select = scan.nextInt();
        while (select < 1 || select > Weapon.weaponLists().length) {
            System.out.println("You entered an invalid value.Try again..");
            select = scan.nextInt();
        }

        Weapon[] w = Weapon.weaponLists();
        switch (select) {
            case 1:
                if (getPlayer().getMoney() < w[0].getMoney()) {
                    System.out.println("You don't have enough money.Try again.");
                    onLocation();
                    break;
                }
                System.out.println("You buy " + w[0].getName() + " Price:" + w[0].getMoney() + " Damage:" + w[0].getDamage());
                this.getPlayer().getInventory().setWeapon(w[0]);  //switch yerine metot kullanabilirsin  
                this.getPlayer().setMoney(getPlayer().getMoney() - w[0].getMoney());
                this.getPlayer().setTotalDamage();
                break;
            case 2:
                if (getPlayer().getMoney() < w[1].getMoney()) {
                    System.out.println("You don't have enough money.Try again.");
                    onLocation();
                    break;
                }
                System.out.println("You buy " + w[1].getName() + " Price:" + w[1].getMoney() + " Damage:" + w[1].getDamage());

                this.getPlayer().getInventory().setWeapon(w[1]);
                this.getPlayer().setMoney(getPlayer().getMoney() - w[1].getMoney());
                this.getPlayer().setTotalDamage();

                break;
            case 3:
                if (getPlayer().getMoney() < w[2].getMoney()) {
                    System.out.println("You don't have enough money.Try again.");
                    onLocation();
                    break;
                }
                System.out.println("You buy " + w[2].getName() + " Price:" + w[2].getMoney() + " Damage:" + w[2].getDamage());

                getPlayer().getInventory().setWeapon(w[2]);
                getPlayer().setMoney(getPlayer().getMoney() - w[2].getMoney());
                this.getPlayer().setTotalDamage();

                break;

        }
        System.out.println("Your remaining balance: " + getPlayer().getMoney());

        getPlayer().getPlayersInfo();
        
        
        
    }

    //Armor listesini gösterip seçtirir
    //eğer para yeterliyse armorName player ın armorName'ine eşitlenir ve parasından düşülür
    public void printArmor() {

        System.out.println("-----Armors-----");
        for (Armor a : Armor.armorLİst()) {
            System.out.println(a.getId() + "- " + a.getName() + " Price:" + a.getPrice() + " Block:" + a.getBlock());
        }

        System.out.print("Select a armor:");
        int select = scan.nextInt();
        while (select < 1 || select > Armor.armorLİst().length) {
            System.out.println("You entered an invalid value.Try again..");
            select = scan.nextInt();
        }

        Armor[] a = Armor.armorLİst();
        switch (select) {
            case 1:
                if (getPlayer().getMoney() < a[0].getPrice()) {
                    System.out.println("You don't have enough money.Try again.");
                    onLocation();
                    break;
                }
                System.out.println("You buy " + a[0].getName() + " Price:" + a[0].getPrice() + " Block:" + a[0].getBlock());

                getPlayer().getInventory().setArmor(a[0]);
                getPlayer().setMoney(getPlayer().getMoney() - a[0].getPrice());
                break;
            case 2:
                if (getPlayer().getMoney() < a[1].getPrice()) {
                    System.out.println("You don't have enough money.Try again.");
                    onLocation();
                    break;
                }
                System.out.println("You buy " + a[1].getName() + " Price:" + a[1].getPrice() + " Block:" + a[1].getBlock());

                getPlayer().getInventory().setArmor(a[1]);
                getPlayer().setMoney(getPlayer().getMoney() - a[1].getPrice());
                break;
            case 3:
                if (getPlayer().getMoney() < a[2].getPrice()) {
                    System.out.println("You don't have enough money.Try again.");
                    onLocation();
                    break;
                }
                System.out.println("You buy " + a[2].getName() + " Price:" + a[2].getPrice() + " Block:" + a[2].getBlock());

                getPlayer().getInventory().setArmor(a[2]);
                getPlayer().setMoney(getPlayer().getMoney() - a[2].getPrice());
                break;

        }
        System.out.println("Your remaining balance: " + getPlayer().getMoney());

    }
}
