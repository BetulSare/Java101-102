
package adventure.game;

import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    public static Scanner scan=new Scanner(System.in);
    
     private String award;

    public Location(Player player,String name) {
        this.player = player;
        this.name=name;
        
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

   

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean combat(int monsNumber){
    return true;
    }
}
