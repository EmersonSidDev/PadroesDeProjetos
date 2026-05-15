package com.github.emersonsid.padroesdeprojetos;

import java.math.BigDecimal;

public class ItemPedido {
    int numero;
    int quantidade;
    Produto produto;

    public ItemPedido(int numero, int quantidade, Produto produto) {
        this.numero = numero;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public BigDecimal obterValorTotal() {
        return produto.getPrecoUnitario().multiply(new BigDecimal(quantidade));
    }

    /// =================
    /// GETTERS E SETTERS
    /// =================

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
