package com.github.emersonsid.padroesdeprojetos.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.emersonsid.padroesdeprojetos.model.Produto;
import com.github.emersonsid.padroesdeprojetos.repository.ProdutoRepository;

public class ProdutoService {
    private ProdutoRepository produtoRepository = new ProdutoRepository();

    public void criarProduto(String descricao, BigDecimal preco) {
        produtoRepository.salvar(descricao, preco);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.listar();
    }
}