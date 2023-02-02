package factory;
/**
 * ToyStore parent class
 * @author Trevor Allison
 */
public abstract class ToyStore {
    /**
     * Method to print out a string of the puzzle order
     * @param type
     * @return string result
     */
    public String orderPuzzle(String type){
        Puzzle puzzle = createPuzzle(type);
        String result = "";
        result += puzzle.assemble()+"\n";
        result += puzzle.boxPuzzle()+"\n";
        return result;
    }
    /**
     * abstract class to create and choose puzzle based on type
     * @param type
     * @return chosen Puzzle
     */
    public abstract Puzzle createPuzzle(String type);
}
