package com.github.emersonsid.padroesdeprojetos;

public class Retangulo implements FormaGeometrica {

    private double altura;
    private double largura;

    @Override
    public FormaGeometrica clone() {
        return new Retangulo(altura, largura);
    }

    @Override
    public void desenhar() {
        System.out.println(
                "Retangulo com altura igual a " + altura +
                        " e largura igual a " + largura
        );
    }

    ///
    /// Constructors
    ///

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    ///
    /// Getters and Setters
    ///

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
