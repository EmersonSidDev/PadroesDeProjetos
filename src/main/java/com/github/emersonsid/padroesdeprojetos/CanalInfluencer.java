package com.github.emersonsid.padroesdeprojetos;

// Concrete Subject
public class CanalInfluencer extends Subject {
    private final String nomeCanal;

    public CanalInfluencer(String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }

    public void publicarConteudo(String conteudo) {
        System.out.println("Canal " + nomeCanal + " publicou: " + conteudo);
        notifyObservers(conteudo);
    }
}
