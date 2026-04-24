package com.github.emersonsid.padroesdeprojetos;

import java.text.DecimalFormat;

/**
 * Demonstração prática do padrão Decorator.
 *
 * O padrão Decorator permite adicionar comportamentos (acréscimos) dinamicamente
 * a objetos, mantendo a interface original. Diferente da herança, oferece
 * flexibilidade para combinar decoradores em tempo de execução.
 *
 * Estrutura:
 * - Lanche (interface/contrato)
 * - SanduicheHamburger (componente concreto base)
 * - AcrescimoDecorator (decorator abstrato)
 * - Bacon, CarneExtra, Queijo, Maionese (decorators concretos)
 */
public class Main {
    private static final DecimalFormat FORMATO_PRECO = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("=== Demonstração do Padrão Decorator ===\n");

        // Exemplo 1: Lanche simples
        System.out.println("--- Exemplo 1: Lanche Simples ---");
        Lanche pedido1 = new SanduicheHamburger();
        exibirPedido(pedido1);

        // Exemplo 2: Lanche com um acréscimo
        System.out.println("\n--- Exemplo 2: Lanche + Bacon ---");
        Lanche pedido2 = new SanduicheHamburger();
        pedido2 = new Bacon(pedido2);
        exibirPedido(pedido2);

        // Exemplo 3: Lanche com múltiplos acréscimos
        System.out.println("\n--- Exemplo 3: Lanche + Bacon + Carne Extra ---");
        Lanche pedido3 = new SanduicheHamburger();
        pedido3 = new Bacon(pedido3);
        pedido3 = new CarneExtra(pedido3);
        exibirPedido(pedido3);

        // Exemplo 4: Lanche com diferentes combinações
        System.out.println("\n--- Exemplo 4: Lanche + Queijo + Maionese + Bacon ---");
        Lanche pedido4 = new SanduicheHamburger();
        pedido4 = new Queijo(pedido4);
        pedido4 = new Maionese(pedido4);
        pedido4 = new Bacon(pedido4);
        exibirPedido(pedido4);

        // Exemplo 5: Demonstração de flexibilidade
        System.out.println("\n--- Exemplo 5: Ordem diferente (ComboLuxo) ---");
        Lanche pedido5 = new SanduicheHamburger();
        pedido5 = new CarneExtra(pedido5);
        pedido5 = new CarneExtra(pedido5);  // Pode decorar múltiplas vezes!
        pedido5 = new Queijo(pedido5);
        pedido5 = new Bacon(pedido5);
        pedido5 = new Maionese(pedido5);
        exibirPedido(pedido5);

        System.out.println("\n=== Benefícios do Padrão Decorator ===");
        System.out.println("✓ Flexibilidade: Combina acréscimos dinamicamente");
        System.out.println("✓ Reutilização: Decoradores podem ser aplicados a qualquer lanche");
        System.out.println("✓ Simplicidade: Sem necessidade de múltiplas classes de herança");
        System.out.println("✓ Composição: Permite ordem e combinações variadas");
    }

    /**
     * Exibe a descrição e o preço formatado de um pedido.
     *
     * @param lanche o lanche a ser exibido
     */
    private static void exibirPedido(Lanche lanche) {
        System.out.println("Descrição: " + lanche.getDescricao());
        System.out.println("Preço: R$ " + FORMATO_PRECO.format(lanche.preco()));
    }
}