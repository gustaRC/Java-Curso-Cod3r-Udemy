package br.com.beltsistemas.exerciciosSB.controllers;

import br.com.beltsistemas.exerciciosSB.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping //== /clientes?id=[NUM]
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "999") int id) { //agora não mais será um PathVariable, mas sim um RequestParam
        return new Cliente(id, "Teste Testado", "999.999.999-99");
    }
}