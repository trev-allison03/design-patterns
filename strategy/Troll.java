package strategy;

public class Troll extends Character{
    /**
     * constructor for troll class, sets name with parameter and sets weapon to axe
     * @param name
     */
    public Troll(String name){
        super(name);
        weaponBehavior = new WeaponAxe();
    }
    /**
     * method to print out information about the troll
     * @return the troll's name and "is a funny troll"
     */
    public String toString(){
        return name+" is a funny Troll";
    }
    
}
