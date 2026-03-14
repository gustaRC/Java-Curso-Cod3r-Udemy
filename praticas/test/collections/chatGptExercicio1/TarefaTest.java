package collections.chatGptExercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class TarefaTest {

	private Tarefa tarefa = new Tarefa("Titulo 1", "Descricao", new Date());
	
	@Test
    void deveRetornarTitulo() {
        assertEquals("Titulo 1", tarefa.getTitulo());
    }

    @Test
    void deveAlterarTitulo() {
        tarefa.setTitulo("Novo titulo");
        assertEquals("Novo titulo", tarefa.getTitulo());
    }

    @Test
    void deveRetornarDescricao() {
        assertEquals("Descricao", tarefa.getDescricao());
    }

    @Test
    void deveAlterarDescricao() {
        tarefa.setDescricao("Nova descricao");
        assertEquals("Nova descricao", tarefa.getDescricao());
    }

    @Test
    void deveAlterarDataPrevista() {
        Date novaData = new Date();
        tarefa.setDataPrevista(novaData);

        assertEquals(novaData, tarefa.getDataPrevista());
    }
}
