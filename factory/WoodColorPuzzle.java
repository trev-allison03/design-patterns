package factory;
/**
 * WoodColorPuzzle class
 * @author Trevor Allison
 */
public class WoodColorPuzzle extends Puzzle{
    /**
     * Constructor that sets name and material and populates the arraylist
     */
    public WoodColorPuzzle(){
        name = "Color Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Red Fish");
        pieces.add("Yellow Fish");
        pieces.add("Green Fish");
        pieces.add("Purple Fish");
        pieces.add("Pink Fish");
        pieces.add("Orange Fish");
        pieces.add("Brown Fish");
        pieces.add("White Fish");
        pieces.add("Black Fish");
    }
}
