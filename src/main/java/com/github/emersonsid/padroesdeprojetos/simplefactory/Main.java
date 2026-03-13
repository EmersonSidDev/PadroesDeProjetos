package com.github.emersonsid.padroesdeprojetos.simplefactory;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = ContaFactory.criarConta("corrente",
                "Arthur", 123456, 1000);
        conta1.descontarTarifa();
        conta1.atualizarRendimento();
        conta1.exibirDados();

        Conta conta2 = ContaFactory.criarConta("poupança",
                "Bianca",654321,1000);
        conta2.descontarTarifa();
        conta2.atualizarRendimento();
        conta2.exibirDados();

    }
}