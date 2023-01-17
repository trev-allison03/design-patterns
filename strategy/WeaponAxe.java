package strategy;
/**
 * Axe weapon
 * @author Trevor Allison
 */
import java.util.Random;

public class WeaponAxe implements WeaponBehavior {
    /**
     * method for choosing what attack to do, by using a random number generator
     * @return a randomly picked attack out of two
     */   
    public String attack(){
        Random rand = new Random();
        int choice = rand.nextInt(2);
        if(choice == 0)
        {
            return "Swing an axe";
        }
        else
        {
            return "Twirl with an axe";
        }
    }
    
}
