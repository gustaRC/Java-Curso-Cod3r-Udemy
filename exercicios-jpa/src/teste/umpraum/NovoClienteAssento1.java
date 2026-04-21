package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Object> dao = new DAO<>();

//      Como Cliente armazena o id do assento, então devemos primeiro criar o Assento para depois criar o Cliente
        dao.abrirTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fecharConexao();
    }
}
