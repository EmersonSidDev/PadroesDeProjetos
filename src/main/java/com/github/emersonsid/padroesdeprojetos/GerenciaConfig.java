package com.github.emersonsid.padroesdeprojetos;

public class GerenciaConfig {
    private static GerenciaConfig instance;

    private String tema;

    private GerenciaConfig(){
        System.out.println("Gerenciamento iniciado.");
        tema = "padrão";
    }

    public static synchronized GerenciaConfig getInstance(){
        if(instance == null){
            instance = new GerenciaConfig();
        }
        return instance;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
