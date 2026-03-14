package com.github.emersonsid.padroesdeprojetos.factorymethod;

public class ContaCorrenteFactory extends ContaFactory {

    @Override
    public Conta criarConta(String nomeTitular, int numeroConta, double saldo) {
        return new ContaCorrente(nomeTitular, numeroConta, saldo);
    }
}
