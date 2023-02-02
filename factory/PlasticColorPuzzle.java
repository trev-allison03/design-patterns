package factory;
/**
 * PlasticColorPuzzle class
 * @author Trevor Allison
 */
public class PlasticColorPuzzle extends Puzzle{
    /**
     * Constructor that sets name and material and populates the arraylist
     */
    public PlasticColorPuzzle(){
        name = "Color Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("Green Dog");
        pieces.add("Orange Dog");
        pieces.add("Red Dog");
        pieces.add("Blue Dog");
        pieces.add("Yellow Dog");
        pieces.add("Brown Dog");
    }
}
