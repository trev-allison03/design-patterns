package strategy;

public class King extends Character{
    /**
     * Constructor for the king class, sets name using parameter and sets weapon type to sword
     * @param name
     */
    public King(String name){
        super(name);
        weaponBehavior = new WeaponSword();
    }
    /**
     * method to print out information about the king
     * @return the king's name and "is a noble king"
     */
    public String toString(){
        return name+" is a Noble King";
    }
    
}
