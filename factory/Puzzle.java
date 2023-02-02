package factory;
import java.util.ArrayList;
/**
 * Abstract parent class puzzle
 * @author Trevor Allison
 */
public abstract class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

    /**
     * assemble class to create a string based on what kind of puzzle it is
     * @return String assemble
     */
    public String assemble(){
        String assemble = "";
        assemble += "Putting together a "+name+"\n";
        assemble += "This puzzle is made out of "+material+"\n";
        assemble += "Adding the following pieces";
        for(String piece : pieces){
            assemble += "- "+piece+"\n";
        }
        return assemble;
    }
    public String boxPuzzle(){
        return "Putting the "+name+" in a box";
    }
}
