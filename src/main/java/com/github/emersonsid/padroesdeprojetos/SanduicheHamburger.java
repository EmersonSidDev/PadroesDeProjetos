package com.github.emersonsid.padroesdeprojetos;

/**
 * Componente concreto: implementa a interface Lanche.
 * Representa um sanduíche hambúrguer simples, sem acréscimos.
 * 
 * Este é um objeto base que pode ser decorado com acréscimos adicionais
 * através de implementações de AcrescimoDecorator.
 */
public class SanduicheHamburger implements Lanche {
    @Override
    public String getDescricao() {
        return "Pão, carne, queijo, alface, tomate, molho";
    }
    
    @Override
    public double preco() {
        return 15.0;
    }
}
