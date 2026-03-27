package com.github.emersonsid.padroesdeprojetos;

public class Livro {

    private String capa;
    private String dedicatoria;
    private String conteudo;
    private String referencias;

    ///
    /// Getters and Setters
    ///

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getDedicatoria() {
        return dedicatoria;
    }

    public void setDedicatoria(String dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    ///
    /// Helpers
    ///

    @Override
    public String toString() {
        return "Livro{" +
                "\ncapa='" + capa + "'" +
                "\ndedicatoria='" + dedicatoria + "'" +
                "\nconteudo='" + conteudo + "'" +
                "\nreferencias='" + referencias + "'" +
                "\n}";
    }
}
