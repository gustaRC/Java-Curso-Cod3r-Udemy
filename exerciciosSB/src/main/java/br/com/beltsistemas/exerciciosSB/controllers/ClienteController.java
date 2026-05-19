package br.com.beltsistemas.exerciciosSB.controllers;

import br.com.beltsistemas.exerciciosSB.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "clientes") //Todos os paths do controller será precedido pela palavra "clientes". Resultado: "localhost:8080/clientes/qualquer"
public class ClienteController {

    @GetMapping(path = "qualquer")
    public Cliente obterCliente() {
        return new Cliente(10, "Biricubico", "123.456.789-00");
    }

    @GetMapping("qualquer2") //podemos declarar explicitamente o 'path = ' ou somente o valor do path diretamente
    public Cliente obterCliente2() {
        return new Cliente(9, "Siricuticu", "999.888.777-00");
    }

    @GetMapping("{id}") //path = "/clientes/[:ID]"
    public Cliente obterClientePorId(@PathVariable int id) { //converterá o valor digitado para int
        return new Cliente(id, "Biricubico e Siricuticu", "123.456.789-00");
    }
}