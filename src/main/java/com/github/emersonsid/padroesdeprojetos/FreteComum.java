package com.github.emersonsid.padroesdeprojetos;

// Concrete Strategy
public class FreteComum implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 2.0;
    }

    @Override
    public String tipoFrete() {
        return "Comum";
    }
}
