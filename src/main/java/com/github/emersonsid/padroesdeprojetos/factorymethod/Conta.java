package com.github.emersonsid.padroesdeprojetos.factorymethod;

public abstract class Conta {
    protected String nomeTitular;
    protected int numeroConta;
    protected double saldo;

    public abstract void descontarTarifa();
    public abstract void atualizarRendimento();

    public Conta(String nomeTitular, int numeroConta, double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirDados(){
        System.out.println();
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Número: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
