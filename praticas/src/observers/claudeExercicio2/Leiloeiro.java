package observers.claudeExercicio2;

public class Leiloeiro implements Observer {

    private double lanceAtual;

    @Override
    public void update(double maiorLanceAtual) {
        if (maiorLanceAtual > 0) {
            lanceAtual = maiorLanceAtual;
            System.out.println("------------------------------------------------");
            System.out.println("🎩 Leiloeiro: Maior lance atual: R$" + lanceAtual);
            System.out.println("-- Quem dá mais?\n");
        }
    }
}