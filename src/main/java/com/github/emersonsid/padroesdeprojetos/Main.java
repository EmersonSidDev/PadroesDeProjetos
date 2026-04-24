package com.github.emersonsid.padroesdeprojetos;

public class Main {
    public static void main(String[] args) {
        Lanche pedido = new SanduicheHamburger();
        System.out.println(pedido.getDescricao() + " - R$ " + pedido.preco());

        pedido = new Bacon(pedido);
        System.out.println(pedido.getDescricao() + " - R$ " + pedido.preco());

        pedido = new CarneExtra(pedido);
        System.out.println(pedido.getDescricao() + " - R$ " + pedido.preco());
    }
}