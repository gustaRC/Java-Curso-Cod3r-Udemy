package observers.claudeExercicio1;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura implements Subject {
//    Requisito 3: Classe SensorTemperatura implementando Subject
//    função que armazena os observadores e os notifica quando acontece o evento desejado

    private List<Observer> observadores = new ArrayList<>();

    private double temperaturaAtual;

    @Override
    public void addObserver(Observer obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observadores.remove(obs);
    }

//  recomendado pelo claude.ai, função Subject clássica armazena o estado internamente
//  e haverá uma função destinada a ler esse estado e notificar os observadores (notifyObservers).
    public void setTemperatura(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        notifyObservers();
    }

//  se quisermos deixar o notifyObservers() privado, devemos removê-lo na interface
//  atualmente não é considerado errado deixar este método de fora da interface Subject,
//  porém, neste caso seguirei o padrão estabelecido na década de 90 (GoF original).
    @Override
    public void notifyObservers() {
        new ArrayList<>(observadores).forEach(obs -> obs.update(temperaturaAtual));
        // recomendado pelo claude.ai -> evitará erro de algum observador ser removido da lista no momento do update/notificação
    }
}
