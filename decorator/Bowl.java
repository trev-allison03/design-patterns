package decorator;
/**
 * bowl class for ice cream
 */
public class Bowl extends IceCream{
    /**
     * constructor
     */
    public Bowl(){
        description = "Bowl";
    }
    /**
     * get cost method to return the cost of the bowl aka 0
     * @return 0
     */
    public double getCost(){
        return 0;
    }
    
}
