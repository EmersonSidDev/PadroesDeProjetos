package com.github.emersonsid.padroesdeprojetos.factorymethod;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContaFactory> factories = new ArrayList<>();

        ArrayList<Conta> contas = new ArrayList<>();

        String nome;
        int numeroConta;
        double saldo;

        factories.add(new ContaCorrenteFactory());
        factories.add(new ContaPoupancaFactory());

        nome = JOptionPane.showInputDialog("Informe o nome: ");
        numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta:"));

        contas.add(factories.get(0).criarConta(
                nome,
                numeroConta,
                500
        ));

        contas.get(0).descontarTarifa();
        contas.get(0).atualizarRendimento();
        contas.get(0).exibirDados();

        contas.add(factories.get(1).criarConta(
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