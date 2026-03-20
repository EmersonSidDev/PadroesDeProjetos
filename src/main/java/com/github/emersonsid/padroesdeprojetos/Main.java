package com.github.emersonsid.padroesdeprojetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaTemas temas;

        String tema = "Default";

        if (tema.equals("Light")){
            temas = new FabricaTemaLight();
        } else {
            temas = new FabricaTemaDefault();
        }

        Aplicacao app = new Aplicacao(temas);
        app.renderizarInterface();
    }
}