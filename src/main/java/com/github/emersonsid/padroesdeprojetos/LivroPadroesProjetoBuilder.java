package com.github.emersonsid.padroesdeprojetos;

public class LivroPadroesProjetoBuilder implements LivroBuilder {

    private Livro livro;

    public LivroPadroesProjetoBuilder() {
        livro = new Livro();
    }

    @Override
    public void buildCapa() {
        livro.setCapa("Padrões de Projeto");
    }

    @Override
    public void buildDedicatoria() {
        livro.setDedicatoria(
                "Dedico este livro ao professor Otaviano da disciplina " +
                        "Padrões de projetos de software com java"
        );
    }

    @Override
    public void buildConteudo() {
        livro.setConteudo(
                """
                        Introdução: Padrões de criação, estruturais e comportamentais
                        Capítulo 01: Simple Factory
                        Capítulo 02: Factory Method
                        Capítulo 03: Abstract Method
                        Capítulo 04: Singleton
                        Capítulo 05: Builder"""
        );
    }

    @Override
    public void buildReferencias() {
        livro.setReferencias(
                "Livro 1\nLivro 2\nArtigo 1\n..."
        );
    }

    @Override
    public Livro getLivro() {
        return livro;
    }
}
