package com.github.emersonsid.padroesdeprojetos.factorymethod;

public abstract class ContaFactory {
    public abstract Conta criarConta(
                                   String nomeTitular,
                                   int numeroConta,
                                   double saldo
    );
}