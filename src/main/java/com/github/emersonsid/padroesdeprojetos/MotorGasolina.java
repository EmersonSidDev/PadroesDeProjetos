package com.github.emersonsid.padroesdeprojetos;

public class MotorGasolina implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor Gasolina - Ligado");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Gasolina - Acelerando com ruído");
    }

    @Override
    public void frear() {
        System.out.println("Motor Gasolina - Frenando");
    }
}
