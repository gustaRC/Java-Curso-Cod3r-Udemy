package modelo.heranca.joined;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //uma tabela para cada classe, com uma coluna (FK) para identificar o tipo de classe
@Table(name = "pessoas_heranca_joined")
public abstract class PessoaJoined {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public PessoaJoined() {
    }

    public PessoaJoined(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
