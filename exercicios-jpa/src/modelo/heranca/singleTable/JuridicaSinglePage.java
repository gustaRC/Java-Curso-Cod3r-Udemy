package modelo.heranca.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("JURIDICA")
public class JuridicaSinglePage extends PessoaSinglePage {
//  Todos os atributos serão nullable, ou seja, podem ser nulos,
//  mesmo que tentemos forçar o seu preenchimento, ainda assim será sem sucesso.

    private String cnpj;

    public JuridicaSinglePage() {
        super();
    }

    public JuridicaSinglePage(String nome, String cnpj) {
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
