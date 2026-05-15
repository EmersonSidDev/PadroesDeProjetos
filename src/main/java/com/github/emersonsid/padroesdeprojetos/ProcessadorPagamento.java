package com.github.emersonsid.padroesdeprojetos;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class ProcessadorPagamento {
    public final void processarPagamento(double valor){
        double valorComTaxas = valor + calcularTaxas(valor);
        System.out.println("Valor original: " + formatarReal(valor) +
                "\nValor com taxas: " + formatarReal(valorComTaxas));

        if(realizarCobranca(valorComTaxas)){
            enviarRecibo();
        } else {
            System.out.println("Falha no processamento do pagamento.");
        }
    }

    protected double calcularTaxas(double valor){
        return valor * 0.00;
    }

    protected abstract boolean realizarCobranca(double valor);

    protected void enviarRecibo(){
        System.out.println("Recibo enviado.");
    }

    public static String formatarReal(double valor){
        Locale ptBr = Locale.of("pt", "BR");
        return NumberFormat.getCurrencyInstance(ptBr).format(valor);
    }
}
