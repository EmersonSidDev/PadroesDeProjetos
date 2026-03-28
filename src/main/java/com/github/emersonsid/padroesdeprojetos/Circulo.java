package com.github.emersonsid.padroesdeprojetos;

public class Circulo implements FormaGeometrica {

    private double raio;

    @Override
    public FormaGeometrica clone() {
        return new Circulo(raio);
    }

    @Override
    public void desenhar() {
        System.out.println("Círculo com raio de igual a " + raio);
    }

    ///
    /// Constructors
    ///

    public Circulo(double raio) {
        this.raio = raio;
    }

    ///
    /// Getters and Setters
    ///

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
