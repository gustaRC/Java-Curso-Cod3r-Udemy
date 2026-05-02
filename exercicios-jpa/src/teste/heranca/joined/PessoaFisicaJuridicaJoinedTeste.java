package teste.heranca.joined;

import infra.DAO;
import modelo.heranca.joined.FisicaJoined;
import modelo.heranca.joined.JuridicaJoined;
import modelo.heranca.joined.PessoaJoined;

import java.util.List;

public class PessoaFisicaJuridicaJoinedTeste {
//  ✅ Normalizado, sem NULLs desnecessários
//  ✅ Permite NOT NULL em campos das subclasses
//  ❌ JOINs em toda consulta → pode ser lento em hierarquias profundas
//  ❌ Inserts e updates tocam múltiplas tabelas

    public static void main(String[] args) {

        PessoaJoined f1 = new FisicaJoined("123456789-00", "Rose");
        PessoaJoined f2 = new FisicaJoined("123456789-00", "Cleber");
        PessoaJoined j1 = new JuridicaJoined("12.345.678/0001-00", "Empresa de Leite");
        PessoaJoined j2 = new JuridicaJoined("12.345.678/0001-00", "Empresa de Suco");

        DAO<PessoaJoined> dao = new DAO<>(PessoaJoined.class);
        dao.incluirAtomico(f1);
        dao.incluirAtomico(f2);
        dao.incluirAtomico(j1);
        dao.incluirAtomico(j2);

        List<PessoaJoined> lista = dao.obterTodos();

        for (PessoaJoined pessoaJoined : lista) {
            System.out.println(pessoaJoined.getId() + " | " +  pessoaJoined.getNome());
        }
    }
}
