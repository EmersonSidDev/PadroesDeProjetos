package com.github.emersonsid.padroesdeprojetos;

public class MotorGasolina implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor Gasolina - Ligado");
    }
}
