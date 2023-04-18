/**
 * @author Trevor Allison
 * in transit state class
 */
package state;

public class InTransitState extends State {
    private int days = 5;

    /**
     * constructor for in transit state class
     * @param pkg
     * @param quantity
     */
    public InTransitState(Package pkg, int quantity){
        super(pkg, quantity);
    }
    /**
     * getStatus method
     * @return string of packages status
     */
    public String getStatus(){
        String result = "";
        result +="The "+this.pkg.getName()+" "+getVerb("is", "are")+" out for delivery";
        return result;
    }
    /**
     * get ETA method
     * @return string of package's eta
     */
    public String getEta(){
        String result = "";
        result += "The "+this.pkg.getName()+" should arrive within "+Integer.toString(days)+" days";
        return result;
    }
    /**
     * applies delay to package and prints out string
     * @return string describing the delay of the package.
     */
    public String delay(){
        days+=3;
        String result = "";
        result += "The "+this.pkg.getName()+" "+getVerb("has","have")+" experienced a slight delay shipping\n";
        result += "The "+this.pkg.getName()+" should arrive within "+this.days+" business days";
        return result;
    }
}
