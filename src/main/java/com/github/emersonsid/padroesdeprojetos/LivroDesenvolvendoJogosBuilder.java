package com.github.emersonsid.padroesdeprojetos;

public class LivroDesenvolvendoJogosBuilder implements LivroBuilder {

    private Livro livro;

    public LivroDesenvolvendoJogosBuilder() {
        livro = new Livro();
    }

    @Override
    public void buildCapa() {
        livro.setCapa("Desenvolvendo Jogos");
    }

    @Override
    public void buildDedicatoria() {
        livro.setDedicatoria(
                "Dedico este à CSJ Digital e seu cofundador Wenes Soares "
        );
    }

    @Override
    public void buildConteudo() {
        livro.setConteudo(
                """
                        Introdução: Criando jogos na Unity utilizando C#
                        Capítulo 01: Instalando os softwares/ferramentas
                        Capítulo 02: Criando um projeto 2D
                        Capítulo 03: Criando os primeiros scripts
                        Capítulo 04: Animando o personagem
                        Capítulo 05: Criando comportamento do inimigo"""
        );
    }

    @Override
    public void buildReferencias() {
        livro.setReferencias(
                """
                        Curso da CSJ Digital:
                            Start Game Dev
                            3D Game Adventure
                            Pixel Pocket
                            Pixel Top Down
                            CSJ Academy 3.0"""
        );
    }

    @Override
    public Livro getLivro() {
        return livro;
    }
}
