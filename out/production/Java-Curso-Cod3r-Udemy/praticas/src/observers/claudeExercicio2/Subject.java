package observers.claudeExercicio2;

public interface Subject {

    void addObserver(Observer obs);

    void removeObserver(Observer obs);

    void notifyObservers();
}
