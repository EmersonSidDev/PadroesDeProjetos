package com.github.emersonsid.padroesdeprojetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro(new MotorEletrico());
        Veiculo carro2 = new Carro(new MotorGasolina());
        Veiculo moto1 = new Moto(new MotorGasolina());
        Veiculo moto2 = new Moto(new MotorEletrico());
        Veiculo caminhao1 = new Caminhao(new MotorGasolina());
        Veiculo caminhao2 = new Caminhao(new MotorEletrico());

        System.out.println("\nCarro 01");
        carro1.movimentar();
        System.out.println("\nCarro 02");
        carro2.movimentar();
        System.out.println("\nMoto 01");
        moto1.movimentar();
        System.out.println("\nMoto 02");
        moto2.movimentar();
        System.out.println("\nCaminhão 01");
        caminhao1.movimentar();
        System.out.println("\nCaminhão 02");
        caminhao2.movimentar();
    }
}