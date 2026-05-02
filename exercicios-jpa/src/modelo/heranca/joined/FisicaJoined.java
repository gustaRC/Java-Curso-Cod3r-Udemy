package modelo.heranca.joined;

import javax.persistence.Entity;

@Entity
public class FisicaJoined extends PessoaJoined {

    private String cpf;

    public FisicaJoined() {
        super();
    }

    public FisicaJoined(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
