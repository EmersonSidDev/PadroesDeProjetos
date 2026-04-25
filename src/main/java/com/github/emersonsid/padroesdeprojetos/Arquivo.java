package com.github.emersonsid.padroesdeprojetos;

public class Arquivo implements ArquivoSistema{
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "Arquivo " + nome);
    }

    @Override
    public int size() {
        return 1;
    }
}
