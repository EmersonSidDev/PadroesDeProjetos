package com.github.emersonsid.padroesdeprojetos;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(20.0);
        Retangulo retangulo1 = new Retangulo(10.0, 20.0);

        Circulo circulo2 = (Circulo) circulo1.clone();
        Circulo circulo3 = circulo1;
        /// Ao fazer isso "Circulo circulo3 = circulo1;",
        /// voce nao cria um novo objeto,
        /// apenas fica com duas variaveis referenciando o mesmo objeto
        
        Retangulo retangulo2 = (Retangulo) retangulo1.clone();

        System.out.println("Circulo1:");
        circulo1.desenhar();
        System.out.println("Circulo2:");
        circulo2.desenhar();
        System.out.println("Circulo3:");
        circulo3.desenhar();

        circulo3.setRaio(5.0);
        System.out.println("\nCirculo3 recebeu novo valor no raio\n");

        System.out.println("Circulo1:");
        circulo1.desenhar();
        System.out.println("Circulo2:");
        circulo2.desenhar();
        System.out.println("Circulo3:");
        circulo3.desenhar();

        System.out.println("\n\n");

        retangulo1.desenhar();
        retangulo2.desenhar();
    }
}