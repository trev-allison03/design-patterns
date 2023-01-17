package strategy;
import java.util.Random;
/**
 * Sword weapon in the game
 * @author Trevor Allison
 */
public class WeaponSword implements WeaponBehavior{
    /**
     * method for choosing what attack to do, by using a random number generator
     * @return a randomly picked attack out of two
     */   
    public String attack(){
        Random rand = new Random();
        int choice = rand.nextInt(0,3);
        if(choice == 2)
        {
            return "Lunge and strike with sword";
        }
        else if(choice == 1)
        {
            return "Fancy turn and slice with sword";
        }
        else
        {
            return "Jam opponents blade with sword";
        }
    }
}
