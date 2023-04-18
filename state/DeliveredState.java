/**
 * @author Trevor Allison
 * delivered state class
 */
package state;

public class DeliveredState extends State {
    /**
     * constructor for delivered state.
     * @param pkg
     * @param quantity
     */
    public DeliveredState(Package pkg, int quantity){
        super(pkg, quantity);
    }
    /**
     * getStatus method
     * @return string of packages status
     */
    public String getStatus(){
        String result = "";
        result += "The "+this.pkg.getName()+" "+getVerb("is", "are")+" here for you";
        return result;
    }
    /**
     * get ETA method
     * @return string of package's eta
     */
    public String getEta(){
        String result = "";
        result += "The "+this.pkg.getName()+" "+getVerb("is", "are")+" here";
        return result;
    }
    /**
     * applies delay to package and prints out string
     * @return string describing the delay of the package.
     */
    public String delay(){
        String result = "";
        result += "The "+this.pkg.getName()+" "+getVerb("has", "have")+" already been delivered";
        return result;
    }
}
