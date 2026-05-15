package com.github.emersonsid.padroesdeprojetos;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento cartao = new PagamentoCartao();
        ProcessadorPagamento pix = new PagamentoPix();

        System.out.println("Compra via cartão de crédito");
        cartao.processarPagamento(100);

        System.out.println("\nCompra via Pix");
        pix.processarPagamento(100);
    }
}