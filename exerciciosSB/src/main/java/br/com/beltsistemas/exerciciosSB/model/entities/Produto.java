package br.com.beltsistemas.exerciciosSB.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank //torna obrigatório
    private String nome;

    @Column(precision = 10, scale = 2)
    @Min(value = 0) //valor mínimo permitido: 0
    private BigDecimal preco;

    @Min(0) //valor mínimo permitido: 0
    @Max(1) //valor máximo permitido: 1
    private Double desconto;

    public Produto() {}

    public Produto(String nome, BigDecimal preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
