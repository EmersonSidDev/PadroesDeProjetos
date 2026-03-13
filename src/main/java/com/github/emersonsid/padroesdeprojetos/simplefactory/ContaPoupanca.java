package com.github.emersonsid.padroesdeprojetos.simplefactory;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo,
                         String nomeTitular, int numeroConta) {
        super(saldo, nomeTitular, numeroConta);
    }

    public void descontarTarifa(){

    }

    @Override
    public void atualizarRendimento() {
        saldo *= 1.005;
    }
}
