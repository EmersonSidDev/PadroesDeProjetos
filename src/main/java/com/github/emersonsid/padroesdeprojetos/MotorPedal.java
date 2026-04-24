package com.github.emersonsid.padroesdeprojetos;

public class MotorPedal implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor Pedal - Pronto para pedalar");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Pedal - Pedalando mais rápido");
    }

    @Override
    public void frear() {
        System.out.println("Motor Pedal - Parando de pedalar");
    }
}
