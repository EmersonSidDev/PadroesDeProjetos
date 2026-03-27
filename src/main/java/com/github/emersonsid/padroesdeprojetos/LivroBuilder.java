package com.github.emersonsid.padroesdeprojetos;

public interface LivroBuilder {
    void buildCapa();
    void buildDedicatoria();
    void buildConteudo();
    void buildReferencias();
    Livro getLivro();
}
