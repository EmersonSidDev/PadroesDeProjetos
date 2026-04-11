package com.github.emersonsid.padroesdeprojetos;

public class Carro extends Veiculo {

    public Carro(Motor motor) {
        super(motor);
    }

    @Override
    public void movimentar() {
        System.out.println("Entrei no carro");
        motor.ligar();
    }
}
