
package adventure.game;

public class Snake extends Monster{

    public Snake() {
        super("Snake", 4,0 ,12,5);
    }
    public int randomDamage(){
    int randomDamage=(int)(Math.random()*4)+3;
    return randomDamage;
    }
}
