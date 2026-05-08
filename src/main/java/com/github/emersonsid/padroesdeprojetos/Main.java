package com.github.emersonsid.padroesdeprojetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        // Exemplo de uso Frete Comum
        calculadoraFrete.setStrategy(new FreteComum());
        calculadoraFrete.calcularFrete(10.0);

        System.out.println(); // espaçamento

        // Exemplo de uso Frete Rápido
        calculadoraFrete.setStrategy(new FreteRapido());
        calculadoraFrete.calcularFrete(20.0);
    }
}