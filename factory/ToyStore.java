package factory;

public abstract class ToyStore {
    public String orderPuzzle(String type){
        Puzzle puzzle = createPuzzle(type);
        String result = "";
        result += puzzle.assemble()+"\n";
        result += puzzle.boxPuzzle()+"\n";
        return result;
    }
    public abstract Puzzle createPuzzle(String type);
}
