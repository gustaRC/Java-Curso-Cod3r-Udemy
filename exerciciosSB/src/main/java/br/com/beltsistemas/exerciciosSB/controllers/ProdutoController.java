package br.com.beltsistemas.exerciciosSB.controllers;

import br.com.beltsistemas.exerciciosSB.model.entities.Produto;
import br.com.beltsistemas.exerciciosSB.model.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    @Autowired //criará um objeto automaticamente
    private ProdutoRepository produtoRepository;

    @PostMapping
//  completamente opcional o @ResponseBody, diz que o retorno será no body da requisição e não no header, por exemplo
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll(); //Retornará TODOS os produtos. Se tiver 1000 produtos, irá trazer os 1000
    }

    @GetMapping("{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }
}
