package decorator;
/**
 * Chocolate Ice Cream Class
 */
public class Chocolate extends ScoopDecorator{
    /**
     * constructor
     * @param iceCream
     * @param numScoops
     */
    public Chocolate(IceCream iceCream, int numScoops){
        super(iceCream, numScoops);
        this.flavor = "chocolate";
        this.flavorCost = 1.5;
    }
    
}
