package com.github.emersonsid.padroesdeprojetos;

public class PagamentoCartao extends ProcessadorPagamento {
    @Override
    protected double calcularTaxas(double valor) {
        return valor * 0.03;
    }

    @Override
    protected boolean realizarCobranca(double valor) {
        System.out.println("Processando pagamento com cartão de crédito no valor de " + formatarReal(valor));
        return true;
    }
}
