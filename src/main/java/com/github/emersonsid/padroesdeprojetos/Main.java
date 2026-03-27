package com.github.emersonsid.padroesdeprojetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        LivroBuilder padroesProjetoBuilder = new LivroPadroesProjetoBuilder();
        LivroBuilder desenvolvendoJogosBuilder = new LivroDesenvolvendoJogosBuilder();

        diretor.construirLivro(padroesProjetoBuilder);
        diretor.construirLivro(desenvolvendoJogosBuilder);

        System.out.println(padroesProjetoBuilder.getLivro());
        System.out.println("\n\n\n\n\n");
        System.out.println(desenvolvendoJogosBuilder.getLivro());
    }
}