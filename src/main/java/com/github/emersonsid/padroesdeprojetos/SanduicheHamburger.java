package com.github.emersonsid.padroesdeprojetos;

public class SanduicheHamburger extends Lanche {
    @Override
    public String getDescricao() {
        return "Pão, carne, queijo, alface, tomate, molho";
    }
    @Override
    public double preco() {
        return 15.0;
    }
}
