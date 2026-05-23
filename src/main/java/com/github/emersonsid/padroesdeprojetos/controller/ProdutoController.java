package com.github.emersonsid.padroesdeprojetos.controller;

import com.github.emersonsid.padroesdeprojetos.service.ProdutoService;

public class ProdutoController {
    private ProdutoService produtoService = new ProdutoService();

    public void criarProduto(String descricao, String preco) {
        produtoService.criarProduto(descricao, new java.math.BigDecimal(preco));
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:\n-----------------------");

        produtoService.listarProdutos().forEach(p -> {
            System.out.println("ID: " + p.getId());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("-----------------------");
        });
    }
}