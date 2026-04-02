package collections.chatGptExercicio1;

import java.util.Date;

public class ListaTarefasTeste {

	public static void main(String[] args) {

		Tarefa teste = new Tarefa("TESTE TITULO1", "DESCRICAO", new Date());
		Tarefa teste2 = new Tarefa("TESTE TITULO2", "DESCRICAO", new Date());
		Tarefa teste3 = new Tarefa("TESTE TITULO3", "DESCRICAO", new Date());

		ListaTarefas lista = new ListaTarefas();
		lista.addTarefa(teste); // ✅ Adicionar itens
		lista.addTarefa(teste2);
		lista.addTarefa(teste3);

		System.out.println(lista); // ✅ Lista ordenada
		System.out.println(lista.getTarefas().get(0)); // ✅ Acesso por indice
	}

}
