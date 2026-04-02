package collections.chatGptExercicio5;

import java.util.Comparator;
import java.util.Objects;

public class Jogador {

    private String nome;
    private int pontuacao;

    public static Comparator<Jogador> comparator = new Comparator<Jogador>() {
        @Override
        public int compare(Jogador j1, Jogador j2) {
            return Integer.compare(j1.getPontuacao(), j2.getPontuacao());
        }
    };

    public Jogador(int pontuacao, String nome) {
        this.pontuacao = pontuacao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return getPontuacao() == jogador.getPontuacao();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPontuacao());
    }

    @Override
    public String toString() {
        return getPontuacao() + " - " + getNome();
    }
}
