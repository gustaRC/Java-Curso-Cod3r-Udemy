package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Sobrinho;
import modelo.muitosparamuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {

        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");

        Sobrinho sobrinho1 = new Sobrinho("Davi");
        Sobrinho sobrinha2 = new Sobrinho("Julia");

        tia1.getSobrinhos().add(sobrinho1); // Maria tem um sobrinho Davi
        sobrinho1.getTios().add(tia1); // Davi tem uma tia Maria

        tia1.getSobrinhos().add(sobrinha2); // Maria tem uma sobrinha Julia
        sobrinha2.getTios().add(tia1); // Julia tem uma tia Maria

        tio2.getSobrinhos().add(sobrinho1); // João tem um sobrinho Davi
        sobrinho1.getTios().add(tio2); // Davi tem um tio João

        tio2.getSobrinhos().add(sobrinha2); // João tem uma sobrinha Julia
        sobrinha2.getTios().add(tio2); // Julia tem um tio João

        DAO<Object> dao = new DAO();
        dao
        .abrirTransacao()
        .incluir(tia1)
        .incluir(tio2)
        .incluir(sobrinho1)
        .incluir(sobrinha2)
        .fecharTransacao()
        .fecharConexao();
    }
}
