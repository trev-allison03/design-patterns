/**
 * @author Trevor Allison
 * 
 * package class for state design pattern
 */

package state;

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * constructor for package class
     * @param name
     * @param quantity
     */
    public Package(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, this.quantity);
        inTransitState = new InTransitState(this, this.quantity);
        deliveredState = new DeliveredState(this, this.quantity);   
    }
    /**
     * order method for package class
     * @return string of status and eta for the ordered state.
     */
    public String order(){
        this.state = this.orderedState;
        String result = "";
        result += this.state.getStatus()+"\n";
        result += this.state.getEta()+"\n";
        return result;
    }
    /**
     * mail method for package class
     * @return string of status and eta for the inTransitState
     */
    public String mail(){
        this.state = this.inTransitState;
        String result = "";
        result += this.state.getStatus()+"\n";
        result += this.state.getEta()+"\n";
        return result;
    }
    /**
     * received method for package class
     * @return string of status for the delivered state
     */
    public String received(){
        this.state = this.deliveredState;
        String result = "";
        result += this.state.getStatus()+"\n";
        return result;
    }
    /**
     * applies delay based on current state's delay
     * @return string of current state's delay
     */
    public String delay(){
        return this.state.delay();
    }
    /**
     * setter for state
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * getter for name
     * @return name
     */
    public String getName(){
        return this.name;
    }
}
