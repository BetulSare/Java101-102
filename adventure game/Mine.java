
package adventure.game;

public class Mine extends BattleLoc{

    public Mine(Player player) {
        super(new Snake(), player, "Mine", "Gold",6);
        getMonster().setDamage(randomDamage());
    }
    public int randomDamage(){
    int randomDamage=(int)(Math.random()*4)+3;
    return randomDamage;
    }
    
}
