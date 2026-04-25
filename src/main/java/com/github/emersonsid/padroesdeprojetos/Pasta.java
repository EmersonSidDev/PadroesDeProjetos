package com.github.emersonsid.padroesdeprojetos;

import java.util.ArrayList;

public class Pasta implements ArquivoSistema {
    private String nome;
    private ArrayList<ArquivoSistema> filhos = new ArrayList<ArquivoSistema>();

    public Pasta(String nome){
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "Pasta " + nome);
        for (ArquivoSistema arquivo : filhos) {
            arquivo.exibir("  " + indentacao);
        }
    }

    public void add(ArquivoSistema arquivo){
        filhos.add(arquivo);
    }
}
