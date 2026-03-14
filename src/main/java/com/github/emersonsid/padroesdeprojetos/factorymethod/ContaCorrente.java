package com.github.emersonsid.padroesdeprojetos.factorymethod;

public class ContaCorrente extends Conta{
    public ContaCorrente(String nomeTitular, int numeroConta, double saldo) {
        super(nomeTitular, numeroConta, saldo);
    }

    public void descontarTarifa(){
        saldo = saldo - 5.0;
    }

    @Override
    public void atualizarRendimento() {

    }
}

