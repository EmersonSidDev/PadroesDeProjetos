package com.github.emersonsid.padroesdeprojetos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    int numero;
    Date data;
    List<ItemPedido> itens = new ArrayList<>();

    public BigDecimal obterValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            valorTotal = valorTotal.add(item.obterValorTotal());
        }
        return valorTotal;
    }

    public void adicionarItem(int quantidade, Produto produto) {
        itens.add(new ItemPedido(itens.size() + 1, quantidade, produto));
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
