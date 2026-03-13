package com.github.emersonsid.padroesdeprojetos.simplefactory;

public class ContaCorrente extends Conta{
    public ContaCorrente(double saldo,
                         String nomeTitular, int numeroConta) {
        super(saldo, nomeTitular, numeroConta);
    }

    public void descontarTarifa(){
        saldo = saldo - 5.0;
    }

    @Override
    public void atualizarRendimento() {

    }
}

