package strategy;
/**
 * Knife weapon in the game
 * @author Trevor Allison
 */
import java.util.Random;

public class WeaponKnife implements WeaponBehavior{
    /**
     * method for choosing what attack to do, by using a random number generator
     * @return a randomly picked attack out of two
     */   
    public String attack() {
        Random rand = new Random();
        int choice = rand.nextInt(0,3);
        if(choice == 2)
        {
            return "Slice with knife";
        }
        else if(choice == 1)
        {
            return "Jab with a knife";
        }
        else
        {
            return "Sneak up on opponent with knife";
        }
    }
}
