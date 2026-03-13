package com.github.emersonsid.padroesdeprojetos.simplefactory;

public class ContaFactory {
    public static Conta criarConta(String tipo,
                                   String nomeTitular, int numeroConta,
                                   double saldo){

        if(tipo.equalsIgnoreCase("CORRENTE")){
            return new ContaCorrente(saldo,
                    nomeTitular, numeroConta);
        }
        else return new ContaPoupanca(saldo,
                nomeTitular, numeroConta);

    }
}