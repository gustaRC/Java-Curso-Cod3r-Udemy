package modelo.muitosparamuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double nota;

    @ManyToMany(cascade = CascadeType.PERSIST) // a partir dos filmes ou atores irá inserir tanto os dados pertencentes a entidade, ou inserir novos dados de outras entidades no banco de dados
    @JoinTable( // configuração da tabela auxiliar
        name = "atores_filmes",
        joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"), // joinColumn pois o relacionamento principal é na classe Filmes
        inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id") // inverseJoinColumns pois o relacionamento inverso/bidirecional é na classe Ator
    )
    private List<Ator> atores = new ArrayList<>();

    public Filme() {
    }

    public Filme(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        if (atores == null) {
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void adicionarAtor(Ator ator) {
        if (ator != null && !getAtores().contains(ator)) {
            getAtores().add(ator);

            if (!ator.getFilmes().contains(this)) {
                ator.getFilmes().add(this);
            }
        }
    }
}
