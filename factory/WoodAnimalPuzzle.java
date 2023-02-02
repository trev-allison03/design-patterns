package factory;
/**
 * Wood animal puzzle class
 * @author Trevor Allison
 */
public class WoodAnimalPuzzle extends Puzzle{
     /**
     * Constructor that sets name and material and populates the arraylist
     */
    public WoodAnimalPuzzle(){
        name = "Animal Puzzle by Melissa and Doug";
        material = "plastic";
        pieces.add("Horse");
        pieces.add("Sheep");
        pieces.add("Dog");
        pieces.add("Cat");
        pieces.add("Cow");
        pieces.add("Chicken");
    }
}
