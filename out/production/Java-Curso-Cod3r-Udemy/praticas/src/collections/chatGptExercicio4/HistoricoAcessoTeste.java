package collections.chatGptExercicio4;

import praticaUtil.FuncUtil;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HistoricoAcessoTeste {
/*
   Você precisa armazenar URLs visitadas por um usuário, mantendo a ordem de visita, mas sem duplicar.
   Requisitos:
   - Não pode repetir
   - Ordem precisa ser preservada
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String urlDigitada = "";
        Set<String> historico = new LinkedHashSet<>();

        System.out.println("Bem-vindo ao histórico de acesso! Digite 'sair' para encerrar a aplicação");
        while(!urlDigitada.equalsIgnoreCase("sair")) {
            System.out.print("Digite qual site deseja acessar (/sair): ");
            urlDigitada = scanner.nextLine();
            if(!urlDigitada.equalsIgnoreCase("sair")){
                historico.add(urlDigitada + ".com");
            }
            System.out.println("URL adicionada ao histórico!");
        }

        System.out.println("\nHistórico de acesso:");
        historico.stream().forEach(System.out::println);

        System.out.println("\n Aplicação encerrada.");
        scanner.close();
    }
}
