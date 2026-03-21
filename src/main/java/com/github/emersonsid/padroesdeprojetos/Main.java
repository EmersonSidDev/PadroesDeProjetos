package com.github.emersonsid.padroesdeprojetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciaConfig config1 = GerenciaConfig.getInstance();
        GerenciaConfig config2 = GerenciaConfig.getInstance();

        System.out.println("Tema inicial: " + config1.getTema());

        config2.setTema("light");

        System.out.println("Config 1: " + config1.getTema());
        System.out.println("Config 2: " + config2.getTema());
    }
}