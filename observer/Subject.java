package observer;
/**
 * Interface for subject
 * @author Trevor Allison
 */
public interface Subject {
    /**
     * declares the register method to register observers
     * @param observer
     */
    public void registerObserver(Observer observer);
    /**
     * declares the remove method to remove observers
     * @param observer
     */
    public void removeObserver(Observer observer);
    /**
     * declares the notify method for observers
     */
    public void notifyObservers();
}
