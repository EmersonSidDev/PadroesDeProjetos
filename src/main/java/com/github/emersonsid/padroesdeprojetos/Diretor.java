package com.github.emersonsid.padroesdeprojetos;

public class Diretor {
    public void construirLivro(LivroBuilder builder){
        builder.buildCapa();
        builder.buildDedicatoria();
        builder.buildConteudo();
        builder.buildReferencias();
    }
}
