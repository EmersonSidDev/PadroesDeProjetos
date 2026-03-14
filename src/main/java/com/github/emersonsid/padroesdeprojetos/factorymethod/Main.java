package com.github.emersonsid.padroesdeprojetos.factorymethod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ContaFactory contaFactory;

        ArrayList<Conta> contas = new ArrayList<>();

        contaFactory = new ContaCorrenteFactory();

        contas.add(contaFactory.criarConta(
                "Arthur",
                123456,
                500
        ));

        contas.get(0).descontarTarifa();
        contas.get(0).atualizarRendimento();
        contas.get(0).exibirDados();

        contaFactory = new ContaPoupancaFactory();

        contas.add(contaFactory.criarConta(
                "Bianca",
                654321,
                2000
        ));
        contas.get(1).descontarTarifa();
        contas.get(1).atualizarRendimento();
        contas.get(1).exibirDados();

        double saldoTotal = 0;
        for(Conta c : contas){
            saldoTotal += c.saldo;
        }

        System.out.println("\nSaldo total das contas: " + saldoTotal);
    }
}