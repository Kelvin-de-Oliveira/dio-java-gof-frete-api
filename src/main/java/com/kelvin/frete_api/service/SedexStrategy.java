package com.kelvin.frete_api.service;

import org.springframework.stereotype.Service;

@Service
public class SedexStrategy implements CalculoFrete {
    public double calcular(double peso, double distancia) {
        return 10 + peso * 1.5 + distancia * 0.1;
    }
    public String getNome() { return "sedex"; }
}

