package com.kelvin.frete_api.facade;

import com.kelvin.frete_api.service.CacheFreteService;
import com.kelvin.frete_api.service.CalculoFrete;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteFacade {
    private final List<CalculoFrete> estrategias;
    private final CacheFreteService cache;

    public FreteFacade(List<CalculoFrete> estrategias, CacheFreteService cache) {
        this.estrategias = estrategias;
        this.cache = cache;
    }

    public double calcularFrete(String transportadora, double peso, double distancia) {
        String chave = transportadora + peso + distancia;
        Double valorCache = cache.get(chave);
        if (valorCache != null) return valorCache;

        CalculoFrete estrategia = estrategias.stream()
                .filter(e -> e.getNome().equalsIgnoreCase(transportadora))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Transportadora não encontrada"));

        double valor = estrategia.calcular(peso, distancia);
        cache.put(chave, valor);
        return valor;
    }
}

