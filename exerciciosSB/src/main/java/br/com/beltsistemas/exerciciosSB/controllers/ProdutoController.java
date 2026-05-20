package br.com.beltsistemas.exerciciosSB.controllers;

import br.com.beltsistemas.exerciciosSB.model.entities.Produto;
import br.com.beltsistemas.exerciciosSB.model.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    @Autowired //criará um objeto automaticamente
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
//  completamente opcional o @ResponseBody, diz que o retorno será no body da requisição e não no header, por exemplo
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll(); //Retornará TODOS os produtos. Se tiver 1000 produtos, irá trazer os 1000
    }

    @GetMapping("paginas/{pag}/{qtde_itens}")
    public Iterable<Produto> obterProdutosPorPagina(
            @PathVariable Integer pag,
            @PathVariable Integer qtde_itens
    ) {
        if (qtde_itens > 5) qtde_itens = 5;
        Pageable page = PageRequest.of(pag, qtde_itens);

        return produtoRepository.findAll(page);
    }

    @GetMapping("{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping("{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}
