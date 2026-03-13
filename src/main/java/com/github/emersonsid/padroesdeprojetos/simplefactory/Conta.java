package com.github.emersonsid.padroesdeprojetos.simplefactory;

public abstract class Conta {
    protected String nomeTitular;
    protected int numeroConta;
    protected double saldo;

    public abstract void descontarTarifa();
    public abstract void atualizarRendimento();

    public Conta(double saldo, String nomeTitular, int numeroConta){
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public void exibirDados(){
        System.out.println();
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Número: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
