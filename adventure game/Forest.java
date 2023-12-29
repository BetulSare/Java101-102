
package adventure.game;

public class Forest extends BattleLoc{

    public Forest(Player player) {
        super(new Vampire(), player, "Forest", "Firewood",3);
    }
}
