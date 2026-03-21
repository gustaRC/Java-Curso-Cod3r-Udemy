package collections.chatGptExercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
/* 
   Crie um programa que armazene tarefas.
   Requisitos:
   - Permitir adicionar tarefas
   - Permitir listar todas as tarefas
   - Permitir acessar uma tarefa pelo índice
*/

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();
/*
    Caracteristicas List:
    Ordem importa
    Permite duplicados
	Precisa acessar por índice
*/

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void addTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    @Override
    public String toString() {
        System.out.println("Lista Tarefas:");

        String stringTarefas = "";
        for (Tarefa tarefa : getTarefas()) {
            stringTarefas += tarefa.toString() + "\n\n";
        }

        return stringTarefas;
    }
}
