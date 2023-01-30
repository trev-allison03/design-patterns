package decorator;
/**
 * Ice cream parent class
 * @author Trevor Allison
 */
public abstract class IceCream {
    protected String description;
    /**
     * To string method
     * @return this.description
     */
    public String toString(){
        return this.description;
    }
    public abstract double getCost();
    
}
