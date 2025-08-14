package com.kelvin.frete_api.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope("singleton")
public class CacheFreteService {
    private final Map<String, Double> cache = new HashMap<>();

    public Double get(String chave) {
        return cache.get(chave);
    }

    public void put(String chave, Double valor) {
        cache.put(chave, valor);
    }
}
