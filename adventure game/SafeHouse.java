
package adventure.game;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player,"Safe House");
    }
    
    @Override
    public boolean onLocation(){
        System.out.println("You are in safe house!");
        getPlayer().setHealth(getPlayer().getOriginalHealth());
        System.out.println("Your health is full: "+getPlayer().getHealth());

        //player.getVisitedLocations() Forest Cave Mine River içermeli
          getPlayer().setVisitedLocations("Safe House");
            return true;
    }
}
