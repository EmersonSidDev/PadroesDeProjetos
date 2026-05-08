package com.github.emersonsid.padroesdeprojetos;

// Context
public class CalculadoraFrete {
    private FreteStrategy strategy;

    public void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }
    public void calcularFrete(double peso) {
        System.out.println("Frete " + strategy.tipoFrete() + " calculado:\n" +
                "Peso: " + peso + "kg\n" +
                "Valor: R$ " + strategy.calcularFrete(peso));
    }
}
