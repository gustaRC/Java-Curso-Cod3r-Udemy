package modelo.heranca.joined;

import javax.persistence.Entity;

@Entity
public class JuridicaJoined extends PessoaJoined {

    private String cnpj;

    public JuridicaJoined() {
        super();
    }

    public JuridicaJoined(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
