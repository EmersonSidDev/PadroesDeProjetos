package com.github.emersonsid.padroesdeprojetos;

import java.util.ArrayList;

public class Pasta implements ArquivoSistema {
    private final String nome;
    private final ArrayList<ArquivoSistema> filhos = new ArrayList<>();

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

    public void remove(ArquivoSistema arquivo){
        filhos.remove(arquivo);
    }

    @Override
    public int size() {
        int total = 0;
        for (ArquivoSistema filho : filhos) {
            total += filho.size();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<ArquivoSistema> getFilhos() {
        return filhos;
    }
}
