package factory;
/**
 * FisherPrice Store Class
 * @author Trevor Allison
 */
public class FisherPriceStore extends ToyStore{
    /**
     * Returns type of puzzle based on user input type
     * @param type
     * @return Puzzle puzzle
     */
    public Puzzle createPuzzle(String type){
        Puzzle puzzle;
        if(type == "color"){
            puzzle = new PlasticColorPuzzle();
        }
        else if(type == "animal"){
            puzzle = new PlasticAnimalPuzzle();
        }
        else{
            puzzle = null;
        }
        return puzzle;
    }
}
