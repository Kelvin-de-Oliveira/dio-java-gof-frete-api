package com.kelvin.frete_api.controller;

import com.kelvin.frete_api.facade.FreteFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteFacade facade;

    public FreteController(FreteFacade facade) {
        this.facade = facade;
    }

    @GetMapping
    public double calcular(@RequestParam String transportadora,
                           @RequestParam double peso,
                           @RequestParam double distancia) {
        return facade.calcularFrete(transportadora, peso, distancia);
    }
}
