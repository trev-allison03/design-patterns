package factory;

public class FisherPriceStore extends ToyStore{
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
