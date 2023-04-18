/**
 * @author Trevor Allison
 * state parent class
 */
package state;

public abstract class State {
    protected Package pkg;
    protected int quantity;
    /**
     * constructor for state
     * @param pkg
     * @param quantity
     */
    public State(Package pkg, int quantity){
        this.pkg = pkg;
        this.quantity = quantity;
    }

    /**
     * abstract classes for states
     */
    public abstract String getStatus();
    public abstract String getEta();
    public abstract String delay();

    /**
     * get verb class for state
     * @param singular
     * @param plural
     * @return singular if quantity = 1, plural if quantity != 1
     */
    protected String getVerb(String singular, String plural){
        if(this.quantity == 1){
            return singular;
        }
        return plural;
    }
}
