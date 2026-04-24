package com.github.emersonsid.padroesdeprojetos;

public class Bicicleta extends Veiculo {

    public Bicicleta(Motor motor) {
        super(motor);
    }

    @Override
    public void movimentar() {
        System.out.println("Montei na bicicleta");
        motor.ligar();
        motor.acelerar();
        motor.frear();
    }
}
