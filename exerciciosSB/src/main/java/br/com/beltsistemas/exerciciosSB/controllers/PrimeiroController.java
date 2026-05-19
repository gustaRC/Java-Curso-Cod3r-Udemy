package br.com.beltsistemas.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //declaramos a classe como um controller do tipo Rest
public class PrimeiroController {

    //declaramos que queremos mapear uma requisição para esse método 'ola'
    @RequestMapping(method = RequestMethod.GET, path = "ola")
    //por padrão, o método do RequestMapping é do tipo GET
    public String ola() {
        return "Olá Spring Boot 1!";
    }

    @GetMapping(path = { "ola2", "saudacao" }) //GetMapping exclusivo para método GET
    public String ola2() {
        return "Olá Spring Boot 2!";
    }
}
