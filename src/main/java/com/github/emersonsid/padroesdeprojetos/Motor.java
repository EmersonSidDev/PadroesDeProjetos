package com.github.emersonsid.padroesdeprojetos;

/**
 * Interface Motor - Implementor no padrão Bridge.
 * Define operações básicas do motor que podem ser implementadas de diferentes formas.
 */
public interface Motor {
    void ligar();
    void acelerar();
    void frear();
}
