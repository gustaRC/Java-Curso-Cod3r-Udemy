package observers.claudeExercicio1;

public interface Subject {
//  Requisito 2: Interface Subject com métodos addObserver, removeObserver, notifyObservers

    void addObserver(Observer obs);

    void removeObserver(Observer obs);

    void notifyObservers();

}
