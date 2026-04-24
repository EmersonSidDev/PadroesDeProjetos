package com.github.emersonsid.padroesdeprojetos;

public class Moto extends Veiculo {

    public Moto(Motor motor) {
        super(motor);
    }

    @Override
    public void movimentar() {
        System.out.println("Subi na moto");
        motor.ligar();
        motor.acelerar();
        motor.frear();
    }
}
