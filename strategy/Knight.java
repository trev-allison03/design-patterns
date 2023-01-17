package strategy;
/**
 * Knight player in the game
 * @author Trevor Allison
 */
public class Knight extends Character{
    /**
     * constructor for the knight class, sets name to parameter and sets weapon to bow
     * @param name
     */
    public Knight(String name) {
        super(name);
        weaponBehavior = new WeaponBow();
    }
    /**
     * method to print out information about the knight
     * @return the knight's name and "is a valiant knight"
     */
    public String toString(){
        return name+" is a valiant knight";
    }
    
}
