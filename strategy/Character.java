package strategy;

/**
 * Character parent class
 * @author Trevor Allison
 */
public abstract class Character {
    protected String name;
    protected WeaponBehavior weaponBehavior;
    /**
     * Constructor for Character class, sets name with parameter
     * @param name
     */
    public Character(String name){
        this.name = name;
    }
    /**
     * Method to call upon another attack method to decide what the program prints out
     * @return the randomly selected output of the attack method of the weapon type chosen,
     */
    public String attack(){
       return weaponBehavior.attack();
    }
    /**
     * allows weapon behavior to be set for characters
     * @param weaponBehavior
     */
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * abstract function prototype of the toString method, declared in the children
     */
    public abstract String toString();

    
}
