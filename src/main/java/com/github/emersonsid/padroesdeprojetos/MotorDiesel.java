package com.github.emersonsid.padroesdeprojetos;

public class MotorDiesel implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor Diesel - Ligado");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Diesel - Acelerando com torque");
    }

    @Override
    public void frear() {
        System.out.println("Motor Diesel - Frenando");
    }
}
