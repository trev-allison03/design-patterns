package factory;
/**
 * Plastic animal puzzle class
 * @author Trevor Allison
 */
public class PlasticAnimalPuzzle extends Puzzle{
    /**
     * Constructor that sets name and material and populates the arraylist
     */
    public PlasticAnimalPuzzle(){
        name = "Animal Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("Fox");
        pieces.add("Elephant");
        pieces.add("Giraffe");
        pieces.add("Owl");
        pieces.add("Monkey");
    }
}
