package com.github.emersonsid.padroesdeprojetos;

public class Caminhao extends Veiculo {

    public Caminhao(Motor motor) {
        super(motor);
    }

    @Override
    public void movimentar() {
        System.out.println("Entrei no caminhão");
        motor.ligar();
    }
}
