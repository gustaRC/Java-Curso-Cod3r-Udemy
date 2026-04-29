package teste.heranca.singleTable;

import infra.DAO;
import modelo.heranca.singleTable.FisicaSinglePage;
import modelo.heranca.singleTable.JuridicaSinglePage;
import modelo.heranca.singleTable.PessoaSinglePage;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaJuridicaSinglePageTeste {
//  SINGLE_TABLE:
//  ✅ Melhor performance em queries (sem JOINs)
//  ✅ Simples de consultar com polimorfismo
//  ❌ Muitas colunas NULL (viola 3NF)
//  ❌ Não permite NOT NULL em campos das subclasses

    public static void main(String[] args) {

        PessoaSinglePage f1 = new FisicaSinglePage("João", "123456789-00");
        PessoaSinglePage f2 = new FisicaSinglePage("Maria", "123456789-00");
        PessoaSinglePage j1 = new JuridicaSinglePage("Empresa X", "12.345.678/0001-00");
        PessoaSinglePage j2 = new JuridicaSinglePage("Empresa Y", "12.345.678/0001-00");

        DAO<PessoaSinglePage> dao = new DAO<>(PessoaSinglePage.class);
        dao.incluirAtomico(f1);
        dao.incluirAtomico(f2);
        dao.incluirAtomico(j1);
        dao.incluirAtomico(j2);

        List<PessoaSinglePage> pessoaSinglePages = new ArrayList<PessoaSinglePage>();
        pessoaSinglePages = dao.obterTodos();

        for (PessoaSinglePage pessoaSinglePage : pessoaSinglePages) {
            System.out.println("Tabela Pessoas:");
            System.out.printf("ID: %d, Nome: %s, Tipo: %s\n", pessoaSinglePage.getId(), pessoaSinglePage.getNome(), pessoaSinglePage.getTipo());
        }
    }
}
