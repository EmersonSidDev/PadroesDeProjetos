package com.github.emersonsid.padroesdeprojetos;

import java.math.BigDecimal;

public class Produto {
    String codigo;
    String descricao;
    BigDecimal precoUnitario;

    public Produto(String codigo, String descricao, BigDecimal precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
    }

    /// =================
    /// GETTERS E SETTERS
    /// =================

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
