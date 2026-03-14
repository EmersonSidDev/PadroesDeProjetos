package com.github.emersonsid.padroesdeprojetos.factorymethod;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nomeTitular, int numeroConta, double saldo) {
        super(nomeTitular, numeroConta, saldo);
    }

    public void descontarTarifa(){

    }

    @Override
    public void atualizarRendimento() {
        saldo *= 1.005;
    }
}
