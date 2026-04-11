package com.github.emersonsid.padroesdeprojetos;

public class MotorEletrico implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor Elétrico - Ligado");
    }
}
