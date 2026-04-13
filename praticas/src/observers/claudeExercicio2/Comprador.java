package observers.claudeExercicio2;

public class Comprador implements Observer {

    private final int id;
    private final double lanceMaximo;
    private final double incremento;
    private final Leilao leilao;

    private double seuLanceAtual = 0;
    private boolean desistiu = false;

    public Comprador(int id, double lanceMaximo, double incremento, Leilao leilao) {
        this.id = id;
        this.lanceMaximo = lanceMaximo;
        this.incremento = incremento;
        this.leilao = leilao;
        leilao.addObserver(this);
    }

    @Override
    public void update(double maiorLanceAtual) {
        // ignora se já desistiu ou se foi ele mesmo que fez o lance
        if (desistiu || seuLanceAtual >= maiorLanceAtual) return;

        double novoLance = maiorLanceAtual + incremento;

        System.out.println(">> 👤 Comprador " + id + " foi notificado. Maior lance: R$" + maiorLanceAtual);

        if (novoLance > lanceMaximo) {
            desistiu = true;
            System.out.println(">>>> Comprador " + id + " desistiu. Não consegue superar R$" + maiorLanceAtual);
            return;
        }

        seuLanceAtual = novoLance;
        System.out.println(">>>> Comprador " + id + " deu lance de R$" + seuLanceAtual);
        leilao.setLance(seuLanceAtual); // dispara novo ciclo automaticamente
    }

    public boolean isDesistiu() { return desistiu; }

    public double getSeuLanceAtual() { return seuLanceAtual; }

    public int getId() { return id; }
}