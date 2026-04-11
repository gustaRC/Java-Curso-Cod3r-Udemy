package observers.claudeExercicio1;

public interface Subject {
//  Requisito 2: Interface Subject com métodos addObserver, removeObserver, notifyObservers

    public abstract void addObserver(Observer obs);

    public abstract void removeObserver(Observer obs);

    public abstract void notifyObservers(double temperatura);

}
