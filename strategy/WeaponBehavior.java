package strategy;
/**
 * Weapon Behavior interface
 * @author Trevor Allison
 */
public interface WeaponBehavior {
    /**
     * declares the attack method
     * @return a string that describes the attack based on which weapon is chosen
     */
    public String attack();
    
}
