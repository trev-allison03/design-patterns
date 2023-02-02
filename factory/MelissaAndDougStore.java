package factory;
/**
 * Melissa and doug store class
 * @author Trevor Allison
 */
public class MelissaAndDougStore extends ToyStore{
    /**
     * Returns type of puzzle based on user input type
     * @param type
     * @return Puzzle puzzle
     */
    public Puzzle createPuzzle(String type){
        Puzzle puzzle;
        if(type == "color"){
            puzzle = new WoodColorPuzzle();
        }
        else if(type == "animal"){
            puzzle = new WoodAnimalPuzzle();
        }
        else{
            puzzle = null;
        }
        return puzzle;
    }
}
