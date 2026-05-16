package com.github.emersonsid.padroesdeprojetos;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("001", "Notebook", new BigDecimal("3999.90"));
        Produto produto2 = new Produto("002", "Teclado", new BigDecimal("277.90"));
        Produto produto3 = new Produto("003", "Mouse", new BigDecimal("128.90"));

        Pedido pedido = new Pedido(1, new Date());
        pedido.adicionarItem(2, produto1);
        pedido.adicionarItem(1, produto2);
        pedido.adicionarItem(3, produto3);

        pedido.imprimirDetalhesPedido();
    }
}