package com.github.emersonsid.padroesdeprojetos;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("trabalho.pdf");
        Arquivo arquivo2 = new Arquivo("lembretes.txt");
        Arquivo arquivo3 = new Arquivo("foto.png");

        Pasta documentos = new Pasta("Documentos");
        documentos.add(arquivo1);
        documentos.add(arquivo2);

        Pasta fotos = new Pasta("Fotos");
        fotos.add(arquivo3);

        Pasta raiz = new Pasta("C:");
        raiz.add(documentos);
        raiz.add(fotos);

        raiz.exibir("- ");
    }
}