package factory;

public class MelissaAndDougStore extends ToyStore{
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
