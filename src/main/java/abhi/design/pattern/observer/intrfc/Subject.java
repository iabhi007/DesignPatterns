package abhi.design.pattern.observer.intrfc;

/**
 * Standard Subject
 */
public interface Subject {

    boolean registerObserver(Observer observer);

    boolean deRegisterObserver(Observer observer);

    void notifyObserver();
}
