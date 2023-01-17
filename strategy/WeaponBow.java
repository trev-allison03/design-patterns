package strategy;
/**
 * Bow Weapon in the game
 * @author Trevor Allison
 */
import java.util.Random;

public class WeaponBow implements WeaponBehavior{
    /**
     * method for choosing what attack to do, by using a random number generator
     * @return a randomly picked attack out of two
     */   
    public String attack() {
        Random rand = new Random();
        int choice = rand.nextInt(0, 2);
        if (choice == 1)
        {
            return "Draw and lose an arrow";
        }
        else
        {
            return "Shoot arrow high in the sky";
        }
    }
}
