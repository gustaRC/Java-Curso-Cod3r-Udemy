package collections.chatGptExercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaTarefasTest {

    private ListaTarefas lista;

    @BeforeEach
    void setup() {
        lista = new ListaTarefas();
    }

    @Test
    void deveIniciarListaVazia() {
        assertTrue(lista.getTarefas().isEmpty());
    }

    @Test
    void deveAdicionarTarefa() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", new Date());

        lista.addTarefa(tarefa);

        assertEquals(1, lista.getTarefas().size());
        assertEquals(tarefa, lista.getTarefas().get(0));
    }

    @Test
    void deveRetornarListaDeTarefas() {
        Tarefa tarefa = new Tarefa("Titulo", "Descricao", new Date());
        lista.addTarefa(tarefa);

        List<Tarefa> tarefas = lista.getTarefas();

        assertEquals(1, tarefas.size());
        assertEquals(tarefa, tarefas.get(0));
    }

    @Test
    void deveAlterarListaDeTarefas() {
        List<Tarefa> novaLista = new ArrayList<>();
        Tarefa tarefa = new Tarefa("Titulo Teste", "Descricao Teste", new Date());

        novaLista.add(tarefa);

        lista.setTarefas(novaLista);

        assertEquals(1, lista.getTarefas().size());
        assertEquals(tarefa, lista.getTarefas().get(0));
    }

    @Test
    void deveAcessarTarefaPorIndice() {
        Tarefa tarefa1 = new Tarefa("Tarefa 1", "Desc 1", new Date());
        Tarefa tarefa2 = new Tarefa("Tarefa 2", "Desc 2", new Date());

        lista.addTarefa(tarefa1);
        lista.addTarefa(tarefa2);

        assertEquals("Tarefa 2", lista.getTarefas().get(1).getTitulo());
    }
}