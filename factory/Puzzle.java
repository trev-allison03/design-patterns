package factory;
import java.util.ArrayList;
public abstract class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

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
