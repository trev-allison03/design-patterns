package strategy;
/**
 * Queen Player for the game
 * @author Trevor Allison
 */
public class Queen extends Character{
    /**
     * constructor for the queen class, sets name with parameter, and sets weapon to knife
     * @param name
     */
    public Queen(String name){
        super(name);
        weaponBehavior = new WeaponKnife();
    }
    /**
     * method to print out information about the queen
     * @return the queen's name and "is a beautiful queen"
     */
    public String toString(){
        return name+" is a beautiful Queen";
    }
    
}
