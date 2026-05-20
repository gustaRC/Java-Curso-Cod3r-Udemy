package br.com.beltsistemas.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

//  path = calculadora/somar/10/20
    @GetMapping(path = "somar/{v1}/{v2}")
    public double somar(@PathVariable double v1, @PathVariable double v2) {
        return v1 + v2;
    }
//  path = calculadora/subtrair?a=100&b=39
    @GetMapping("subtrair")
    public double subtrair(@RequestParam(name = "a") double v1, @RequestParam(name = "b") double v2) {
        return v1 - v2;
    }
}
