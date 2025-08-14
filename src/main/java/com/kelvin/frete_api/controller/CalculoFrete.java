package com.kelvin.frete_api.controller;

public interface CalculoFrete {
    double calcular(double peso, double distancia);
    String getNome();
}
