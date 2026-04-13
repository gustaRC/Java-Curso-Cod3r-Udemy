package observers.claudeExercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private double maiorLanceAtual = 0;
    private int rodadaAtual = 1;

    public List<Observer> getObservers() {
        return Collections.unmodifiableList(observers);
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void setLance(double lance) {
        System.out.println("\n>> Rodada " + rodadaAtual);
        if (maiorLanceAtual < lance) {
            this.maiorLanceAtual = lance;
            rodadaAtual += 1;
            this.notifyObservers();
        } else {
            System.out.println(">> Lance inválido...");
        }
    }

    @Override
    public void notifyObservers() {
        new ArrayList<>(observers).forEach(obs -> obs.update(maiorLanceAtual));
    }
}
