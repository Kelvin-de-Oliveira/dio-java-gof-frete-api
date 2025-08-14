package com.kelvin.frete_api.service;

import org.springframework.stereotype.Service;

@Service
public class TransportadoraXStrategy implements CalculoFrete {
    public double calcular(double peso, double distancia) {
        return 15 + peso * 1.2 + distancia * 0.05;
    }
    public String getNome() { return "transportadoraX"; }
}

