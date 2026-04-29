package modelo.heranca.singleTable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //uma tabela para todas as classes, com uma coluna para identificar o tipo de classe
@DiscriminatorColumn(name = "tipo" ,discriminatorType = DiscriminatorType.STRING) //coluna para identificar o tipo de classe, com o nome "tipo" e o tipo STRING
@Table(name = "pessoas_heranca_singlepage")
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
