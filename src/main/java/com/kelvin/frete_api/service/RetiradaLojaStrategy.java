package com.kelvin.frete_api.service;

import org.springframework.stereotype.Service;

@Service
public class RetiradaLojaStrategy implements CalculoFrete {
    public double calcular(double peso, double distancia) {
        return 0;
    }
    public String getNome() { return "retiradaLoja"; }
}