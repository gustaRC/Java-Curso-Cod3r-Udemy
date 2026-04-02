package collections.chatGptExercicio3;

import praticaUtil.FuncUtil;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContadorPalavrasTeste {
/*
   Seu programa deve contar quantas vezes cada palavra aparece.
   Dicas:
   - Estrutura chave/valor

   Resultado esperado:
   - java = 3, python = 2, kotlin = 1
*/

    public static void main(String[] args) {

        String palavras = "java java python java kotlin python";

//      chave: palavras / valor: quantidade de vezes que se repete
        Map<String, Integer> palavrasContadas = new LinkedHashMap<>();

        String[] palavrasArray = palavras.split(" ");

        for (int i = 0; i < palavrasArray.length; i++) {
            final String palavra = palavrasArray[i];

            palavrasContadas.put(
                palavra,
                palavrasContadas.containsKey(palavra) ? palavrasContadas.get(palavra).intValue() + 1 : 1
            );
        }

        System.out.println(palavrasContadas);
    }
}