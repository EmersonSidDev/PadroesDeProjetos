package com.github.emersonsid.padroesdeprojetos;

import com.github.emersonsid.padroesdeprojetos.controller.ProdutoController;

public class Main {
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();

        produtoController.criarProduto("Geladeira", "3500.00");
        produtoController.criarProduto("Sofá", "800.00");
        produtoController.criarProduto("Smart TV", "2200.00");
        produtoController.criarProduto("Mesa", "400.00");
        produtoController.criarProduto("Cadeira", "80.00");

        produtoController.listarProdutos();
    }
}