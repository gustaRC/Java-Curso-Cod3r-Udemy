package observers.claudeExercicio1;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura implements Subject {
//    Requisito 3: Classe SensorTemperatura implementando Subject
//    função que armazena os observadores e os notifica quando acontece o evento desejado

    List<Observer> observadores = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observadores.remove(obs);
    }

    @Override
    public void notifyObservers(double temperatura) {
        observadores.forEach(obs -> obs.update(temperatura));
    }
}
