/**
 * @author Trevor Allison
 * ordered state class
 */
package state;

public class OrderedState extends State {
    private int days = 2;

    /**
     * Constructor for ordered state
     * @param pkg
     * @param quantity
     */
    public OrderedState(Package pkg, int quantity){
        super(pkg, quantity);
    }
    /**
     * getStatus method
     * @return string of packages status
     */
    public String getStatus(){
        String result = "";
        result +="The "+this.pkg.getName()+" "+getVerb("was", "were")+" ordered";
        return result;
    }
    /**
     * get ETA method
     * @return string of package's eta
     */
    public String getEta(){
        String result = "";
        result += "The "+this.pkg.getName()+" will be shipped in "+Integer.toString(days)+" business days";
        return result;
    }
    /**
     * applies delay to package and prints out string
     * @return string describing the delay of the package.
     */
    public String delay(){
        days+=2;
        String result = "";
        result += "The "+this.pkg.getName()+" experienced a slight delay in manufacturing.\n";
        result += "The "+this.pkg.getName()+" will be shipped within "+this.days+" business days";
        return result;
    }
}
