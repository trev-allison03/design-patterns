package decorator;
/**
 * Strawberry ice cream class
 */
public class Strawberry extends ScoopDecorator{
    /**
     * constructor
     * @param iceCream
     * @param numScoops
     */
    public Strawberry(IceCream iceCream, int numScoops){
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4;
    }
    
}
