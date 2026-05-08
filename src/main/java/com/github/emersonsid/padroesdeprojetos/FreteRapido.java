package com.github.emersonsid.padroesdeprojetos;

// Concrete Strategy
public class FreteRapido implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }

    @Override
    public String tipoFrete() {
        return "Rápido";
    }
}
