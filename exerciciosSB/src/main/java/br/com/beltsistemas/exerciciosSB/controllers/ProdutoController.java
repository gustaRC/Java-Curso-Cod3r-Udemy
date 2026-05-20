package br.com.beltsistemas.exerciciosSB.controllers;

import br.com.beltsistemas.exerciciosSB.model.entities.Produto;
import br.com.beltsistemas.exerciciosSB.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    @Autowired //criará um objeto automaticamente
    private ProdutoRepository produtoRepository;

    @PostMapping
//  completamente opcional o @ResponseBody, diz que o retorno será no body da requisição e não no header, por exemplo
    public @ResponseBody Produto novoProduto(
            @RequestParam String nome,
            @RequestParam double preco,
            @RequestParam double desc
        ) {
        Produto produto = new Produto(nome, new BigDecimal(preco), desc);
        produtoRepository.save(produto);
        return produto;
    }
}
