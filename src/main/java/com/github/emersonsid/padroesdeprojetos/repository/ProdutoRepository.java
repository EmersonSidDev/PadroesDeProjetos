package com.github.emersonsid.padroesdeprojetos.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.github.emersonsid.padroesdeprojetos.model.Produto;
import com.github.emersonsid.padroesdeprojetos.util.JPAUtil;

public class ProdutoRepository {
    public void salvar(String descricao, BigDecimal preco) {
        EntityManager em = JPAUtil.getEntityManager();
        Produto produto = new Produto(descricao, preco);

        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }

    public List<Produto> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Produto> produtos = em.createQuery(
            "SELECT p FROM Produto p",
            Produto.class
        ).getResultList();
        em.close();
        return produtos;
    }
}