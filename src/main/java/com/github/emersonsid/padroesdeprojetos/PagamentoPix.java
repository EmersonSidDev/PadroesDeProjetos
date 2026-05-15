package com.github.emersonsid.padroesdeprojetos;

public class PagamentoPix extends ProcessadorPagamento {
    @Override
    protected double calcularTaxas(double valor) {
        return valor * 0.01;
    }

    @Override
    protected boolean realizarCobranca(double valor) {
        System.out.println(
                "Processando pagamento com pix no valor de "
                        + ProcessadorPagamento.formatarReal(valor)
        );
        return true;
    }
}
