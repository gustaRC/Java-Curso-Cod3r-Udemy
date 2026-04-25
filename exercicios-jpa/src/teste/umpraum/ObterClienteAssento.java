package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

//      ----------------------- CLIENTE  -----------------------
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Long idDesejado = 1L;
        Cliente cliente = daoCliente.obterPorId(idDesejado);

        System.out.println("Classe Cliente - Assento id " + idDesejado + ": " + cliente.getAssento().getNome());
        System.out.println("Classe cliente - Cliente do Assento id " + idDesejado + ": " + cliente.getAssento().getCliente().getNome());
        daoCliente.fecharConexao();

//      ----------------------- ASSENTO -----------------------
//        DAO<Assento> daoAassento = new DAO<>(Assento.class);
//        idDesejado = 2L;
//        Assento assento = daoAassento.obterPorId(idDesejado);
//
//        System.out.println("Classe Assento - Assento id " + idDesejado + ": " + assento.getNome());
//        System.out.println("Classe Assento - Cliente do Assento id " + idDesejado + ": " + assento.getCliente().getNome());

//        daoAassento.fecharConexao();
    }
}
