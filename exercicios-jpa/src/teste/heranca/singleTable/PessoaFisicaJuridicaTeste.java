package teste.heranca.singleTable;

import infra.DAO;
import modelo.heranca.singleTable.Fisica;
import modelo.heranca.singleTable.Juridica;
import modelo.heranca.singleTable.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaJuridicaTeste {
//  SINGLE_TABLE:
//  ✅ Melhor performance em queries (sem JOINs)
//  ✅ Simples de consultar com polimorfismo
//  ❌ Muitas colunas NULL (viola 3NF)
//  ❌ Não permite NOT NULL em campos das subclasses

    public static void main(String[] args) {

        Pessoa f1 = new Fisica("João", "123456789-00");
        Pessoa f2 = new Fisica("Maria", "123456789-00");
        Pessoa j1 = new Juridica("Empresa X", "12.345.678/0001-00");
        Pessoa j2 = new Juridica("Empresa Y", "12.345.678/0001-00");

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);
        dao.incluirAtomico(f1);
        dao.incluirAtomico(f2);
        dao.incluirAtomico(j1);
        dao.incluirAtomico(j2);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas = dao.obterTodos();

        for (Pessoa pessoa : pessoas) {
            System.out.println("Tabela Pessoas:");
            System.out.printf("ID: %d, Nome: %s, Tipo: %s\n", pessoa.getId(), pessoa.getNome(), pessoa.getTipo());
        }
    }
}
