package modelo.heranca.tablePerClass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class JogadorTablePerClass {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Devido ao Table Per Class o id precisa ser AUTO ou SEQUENCE (Recomendado SEQUENCE)
    // pois o ID precisa ser único entre todas as tabelas da hierarquia, caso contrário ocorrerá conflito ao buscar as heranças da classe com UNION do JPA
    private Long id;

    private String nome;

    @Column(name = "vida_max")
    private int vida;

    public JogadorTablePerClass() {
    }

    public JogadorTablePerClass(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
