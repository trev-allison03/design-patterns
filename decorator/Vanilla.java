package decorator;
/**
 * vanilla ice cream class, 
 * @author Trevor Allison
 */
public class Vanilla extends ScoopDecorator{
    /**
     * constructor
     * @param iceCream
     * @param numScoops
     */
    public Vanilla(IceCream iceCream, int numScoops){
        super(iceCream, numScoops);
        this.flavorCost = 1.25;
        this.flavor = "vanilla";
    }
}
