package com.github.emersonsid.padroesdeprojetos;

public class Main {
    public static void main(String[] args) {
        CanalInfluencer canal = new CanalInfluencer("Sidmodius");
        Inscrito inscrito = new Inscrito("Inscrito 01");
        Inscrito inscrito2 = new Inscrito("Inscrito 02");
        Inscrito inscrito3 = new Inscrito("Inscrito 03");

        canal.attach(inscrito);
        canal.attach(inscrito2);
        canal.attach(inscrito3);

        canal.publicarConteudo("Aprenda tudo sobre Padrões de Projeto");

        canal.detach(inscrito2);

        System.out.println("\nApós o Inscrito 02 se desinscrever:\n");

        canal.publicarConteudo("Desenvolvendo Jogos na Unity");
    }
}