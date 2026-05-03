package teste.heranca.tablePerClass;

import infra.DAO;
import modelo.heranca.tablePerClass.ArqueiroTablePerClass;
import modelo.heranca.tablePerClass.GuerreiroTablePerClass;
import modelo.heranca.tablePerClass.JogadorTablePerClass;

import java.util.ArrayList;
import java.util.List;

public class JogadorGuerreiroArqueiroTablePerClassTeste {

    public static void main(String[] args) {

        JogadorTablePerClass g1 = new GuerreiroTablePerClass("Guts", 120, false, true);
        JogadorTablePerClass g2 = new GuerreiroTablePerClass("Kratos Fresco", 150, true, false);
        JogadorTablePerClass a1 = new ArqueiroTablePerClass("Robin Hood", 75, false, true);
        JogadorTablePerClass a2 = new ArqueiroTablePerClass("Arqueiros de Anor Londo", 90, true, false);

        DAO<JogadorTablePerClass> dao = new DAO<>(JogadorTablePerClass.class);
        dao.incluirAtomico(g1);
        dao.incluirAtomico(g2);
        dao.incluirAtomico(a1);
        dao.incluirAtomico(a2);

        List<JogadorTablePerClass> listaJogadores = new ArrayList<>();
        listaJogadores = dao.obterTodos();

        for (JogadorTablePerClass jogador : listaJogadores) {
            System.out.println("ID: " + jogador.getId() + "- Nome: " + jogador.getNome() + " - Vida: " + jogador.getVida());
        }

    }
}
