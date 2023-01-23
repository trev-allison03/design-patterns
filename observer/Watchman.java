package observer;

import java.util.ArrayList;
/**
 * Watchman Class
 * @author Trevor Allison
 */
public class Watchman implements Subject {
    private ArrayList<Observer> observers;
    private int warning;
    /**
     * Constructor for watchman, initializes ArrayList
     */
    public Watchman(){
        observers = new ArrayList<Observer>();
    }
     /**
     * register method to register observers, adds them to arraylist
     * @param observer
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    /**
     * remove method to remove observers from the list
     * @param observer
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /**
     * method to notify the observers when warning changes, calls update function
     */
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(warning);
        }
    }
    /**
     * issue warning method, sets/updates the warning variable, then issues a message depending on whether warning is 1 or 2
     * @param warning
     */
    public void issueWarning(int warning){
        this.warning = warning;
        if(warning == 1){
            System.out.println("WARNING: 1 trumpet was played!");
            notifyObservers();
        }
        else{
            System.out.println("WARNING: 2 trumpets were played!");
            notifyObservers();
        }
    }
}
