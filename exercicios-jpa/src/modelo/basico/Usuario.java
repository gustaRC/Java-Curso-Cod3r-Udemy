package modelo.basico;

import javax.persistence.*;

@Entity //PARA TODOS AS ANOTAÇÕES: se não passarmos nenhum parâmetro será interpretado que o nome da tabela é o mesmo nome da classe
public class Usuario {

    @Id //TEM QUE FICAR ACIMA DA VARIÁVEL, o atributo abaixo será considerado o ID/PRIMARY KEY da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // valor será gerado automaticamente
    private Long id;
    @Column(name = "nome")
    private String nome;
    //@Transient //-> não será mapeado para o banco de dados
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
