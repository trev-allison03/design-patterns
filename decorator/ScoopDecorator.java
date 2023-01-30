package decorator;
/**
 * ScoopDecorator class that is IceCream and is parent class to the flavors
 */
public abstract class ScoopDecorator extends IceCream{
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;
    /**
     * constructor for the class
     * @param iceCream
     * @param numScoops
     */
    public ScoopDecorator(IceCream iceCream, int numScoops){
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }
    /**
     * to string method to write out what kind of icecream/cone
     * @return String
     */
    public String toString(){
        if(numScoops == 1){
            return iceCream.toString()+" , a scoop of "+flavor+" ice cream";
        }
        else{
            return iceCream.toString()+" , "+numScoops+" scoops of "+flavor+" ice cream";
        }
    }
    /**
     * get cost method to return the total cost of icecream and cone/bowl
     * @return double
     */
    public double getCost(){
        return iceCream.getCost() + (numScoops * this.flavorCost);
    }
}
