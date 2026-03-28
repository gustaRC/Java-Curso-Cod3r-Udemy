package collections.chatGptExercicio5;

import praticaUtil.FuncUtil;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RankingJogadoresTeste {
/*
   Você precisa armazenar um ranking: 1000 -> João | 800 -> Maria | 1200 -> Pedro.
   Requisitos:
   - Manter os dados ordenados pela pontuação
   - Permitir busca rápida
   - Saida esperada: 800 -> Maria | 1000 -> João | 1200 -> Pedro
*/

    public static void main(String[] args) {


        Set<Jogador> jogadores = new TreeSet<>(Jogador.comparator);

        jogadores.add(new Jogador(2000, "Gustavo"));
        jogadores.add(new Jogador(1000, "João"));
        jogadores.add(new Jogador(800, "Maria"));
        jogadores.add(new Jogador(1200, "Pedro"));
        jogadores.add(new Jogador(200, "Felipe"));

        System.out.println("Ranking dos jogadores:");
        FuncUtil.imprimirTodosItensDaLista(jogadores);
    }
}