package com.kelvin.frete_api.service;

public interface CalculoFrete {
    double calcular(double peso, double distancia);
    String getNome();
}
