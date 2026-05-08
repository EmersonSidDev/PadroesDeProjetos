package com.github.emersonsid.padroesdeprojetos;

// Strategy
public interface FreteStrategy {
    String tipoFrete();
    double calcularFrete(double peso);
}
