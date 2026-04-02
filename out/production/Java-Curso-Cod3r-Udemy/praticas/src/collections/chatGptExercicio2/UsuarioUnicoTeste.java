package collections.chatGptExercicio2;

import java.util.HashSet;
import java.util.Set;

import praticaUtil.FuncUtil;

public class UsuarioUnicoTeste {
/* 
   Você precisa armazenar nomes de usuários cadastrados.
   Requisitos:
   - Não pode existir usuário duplicado
   - Não precisa acessar por índice
   - Ordem não importa
*/
	
	public static void main(String[] args) {
		
		Set<Usuario> usuariosUnicos = new HashSet<Usuario>();

		usuariosUnicos.add(new Usuario("Carlos", 19));
		usuariosUnicos.add(new Usuario("Maria", 25));
		usuariosUnicos.add(new Usuario("João", 37));
		usuariosUnicos.add(new Usuario("Carlos", 22));
		usuariosUnicos.add(new Usuario("Maria", 25));
		
		FuncUtil.imprimirTodosItensDaLista(usuariosUnicos);
		// ✅ Não pode existir usuário duplicado -> só deu certo porque declarei o hashcode e equals na classe 'Usuario'
		// ✅ Não precisa acessar por índice
		// ✅ Ordem não importa
	}

}
