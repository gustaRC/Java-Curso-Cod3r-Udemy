package observers.claudeExercicio1;

@FunctionalInterface
public interface Observer {
//    Requisito 1: Interface Observer com método update(double temperatura)

    public abstract void update(double temperatura); // método para reação | função centralizadora para ações
}
