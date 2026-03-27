package com.github.emersonsid.padroesdeprojetos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        LivroBuilder padroesProjetoBuilder = new LivroPadroesProjetoBuilder();

        diretor.construirLivro(padroesProjetoBuilder);

        System.out.println(padroesProjetoBuilder.getLivro());
    }
}