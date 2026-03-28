package collections.chatGptExercicios6;

import praticaUtil.FuncUtil;

import java.util.Collection;
import java.util.Queue;

public class FilaDeAtendimentoTeste {
/*
   Simule uma fila de banco.
   Requisitos:
   - O primeiro a entrar, tem que ser o primeiro a sair
*/

    public static void main(String[] args) {

        Queue<String> filaDeAtendimento = new java.util.LinkedList<>();
        filaDeAtendimento.add("Carlos");
        filaDeAtendimento.add("Ana");
        filaDeAtendimento.add("Pedro");

        while (!filaDeAtendimento.isEmpty()) {
            exibirInformacoes(filaDeAtendimento);
            filaDeAtendimento.poll();
        }
    }

    private static void exibirInformacoes(Collection<String> clientes) {
        System.out.println("Lista de espera:");
        FuncUtil.imprimirTodosItensDaLista(clientes);
        clientes.stream().findFirst().ifPresent(cliente -> System.out.println("- Próximo cliente a ser atendido: " + cliente));
        System.out.println();
    }
}
