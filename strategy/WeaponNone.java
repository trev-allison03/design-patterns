package strategy;

/**
 * None weapon in the game
 * @author Trevor Allison
 */
import java.util.Random;
public class WeaponNone implements WeaponBehavior {
    /**
     * attack method to denote which attack was (not) done
     * @return a string chosen at random for what the (not) attack was (out of 2 options)
     */
    public String attack() {
        Random rand = new Random();
        int choice = rand.nextInt(0,2);
        if(choice == 1)
        {
            return "Oh no!, I lost my weapon";
        }
        else
        {
            return "No one lets me have my weapon";
        }
    }
    
}
