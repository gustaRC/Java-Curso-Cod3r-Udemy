package modelo.muitosparamuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "atores")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // entidade mapeada por Filme
    @ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST) // a partir dos filmes ou atores irá inserir tanto os dados pertencentes a entidade, ou inserir novos dados de outras entidades no banco de dados
    private List<Filme> filmes = new ArrayList<>();

    public Ator() {
    }

    public Ator(String nome) {
        this.nome = nome;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
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
