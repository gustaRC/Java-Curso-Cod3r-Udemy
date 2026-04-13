package observers.claudeExercicio2;

public class LeilaoTeste {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Leilão ---");
        System.out.println("Comecem seus lances e vamos ver quem leva!!!");

        Leilao leilao = new Leilao();
        Leiloeiro leiloeiro = new Leiloeiro();
        leilao.addObserver(leiloeiro);
        new Comprador(1, 1000, 200, leilao);
        new Comprador(2, 2000, 400, leilao);
        new Comprador(3, 3000, 600, leilao);

        leilao.setLance(100);

        System.out.println("\n--- Encerrando Leilão ---");
    }
}
