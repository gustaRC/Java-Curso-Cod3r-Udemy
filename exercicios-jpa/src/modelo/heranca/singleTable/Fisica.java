package modelo.heranca.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FISICA")
public class Fisica extends Pessoa {
//  Todos os atributos serão nullable, ou seja, podem ser nulos,
//  mesmo que tentemos forçar o seu preenchimento, ainda assim será sem sucesso.

    private String cpf;

    public Fisica() {
        super();
    }

    public Fisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
