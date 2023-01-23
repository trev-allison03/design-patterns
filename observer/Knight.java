package observer;
/**
 * Knight class
 * @author Trevor Allison
 */
public class Knight implements Observer {
    private Subject watchman;
     /**
     * Constructor for knight, declares watchman and registers it
     * @param watchman
     */
    public Knight(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
     /**
     * update function for knight, depending on whether 1 or 2 warnings were issued
     * @param warning
     */
    public void update(int warning){
        if(warning == 1){
            display1();
        }
        else{
            display2();
        }
    }
     /**
     * display functions 1 and 2 that are called by the update function depending on whether warning 1 or 2 was issued
     */
    public void display1(){
        System.out.println("Knight: Helps everyone get home safe");
    }
    public void display2(){
        System.out.println("Knight: Prepares for battles");
    }
}
