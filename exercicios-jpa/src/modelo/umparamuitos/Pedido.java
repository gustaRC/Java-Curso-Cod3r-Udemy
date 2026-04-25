package modelo.umparamuitos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    private String descricao;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY) // por padrão no @OneToMany é LAZY (...ToMany -> LAZY)
    private List<ItemPedido> itens;

    public Pedido() {
        this.data = new Date();
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public Pedido(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
