package com.github.emersonsid.padroesdeprojetos.factorymethod;

public class ContaPoupancaFactory extends ContaFactory {

    @Override
    public Conta criarConta(String nomeTitular, int numeroConta, double saldo) {
        return new ContaPoupanca(nomeTitular, numeroConta, saldo);
    }
}
