package com.github.emersonsid.padroesdeprojetos;

public class MotorEletrico implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor Elétrico - Ligado");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Elétrico - Acelerando silenciosamente");
    }

    @Override
    public void frear() {
        System.out.println("Motor Elétrico - Frenando regenerativo");
    }
}
