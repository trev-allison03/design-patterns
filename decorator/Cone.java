package decorator;
/**
 * Cone Class for ice cream
 * @author Trevor Allison
 */
public class Cone extends IceCream{
    private ConeType coneType;
    /**
     * Constructor
     * @param coneType
     */
    public Cone(ConeType coneType){
        this.coneType = coneType;
        description = this.coneType.toString();
        description = description.replace('_',' ');
        description = description.toLowerCase();
        description = description.substring(0,1).toUpperCase() + description.substring(1);
    }
    /**
     * get cost method that returns different costs based on what cone you got
     * @return double price
     */
    public double getCost(){
        if (this.coneType == ConeType.CHOCOLATE_DIPPED_CONE){
            return 1.5;
        }
        else if(this.coneType == ConeType.PRETZEL_CONE){
            return 1.8;
        }
        else if(this.coneType == ConeType.SUGAR_CONE){
            return 0.75;
        }
        else{
            return 1.2;
        }
    }
}
