package com.github.emersonsid.padroesdeprojetos;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Pedido {
    private static final int LARGURA_CONSOLE_PADRAO = 120;
    int numero;
    Date data;
    List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(int quantidade, Produto produto) {
        itens.add(new ItemPedido(itens.size() + 1, quantidade, produto));
    }

    public BigDecimal obterValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            valorTotal = valorTotal.add(item.obterValorTotal());
        }
        return valorTotal;
    }

    public void imprimirDetalhesPedido(){
        String cabecalhoPedido = "PEDIDO " + numero + "  |  DATA: " + formatarData(data);
        String cabecalhoTabela = montarLinhaTabela(
                "Numero item",
                "Codigo produto",
                "Descricao",
                "Quantidade",
                "Valor unitario",
                "Valor total");
        String separador = "-".repeat(cabecalhoTabela.length());
        int larguraConsole = obterLarguraConsole(cabecalhoTabela.length());

        imprimirCentralizado(separador, larguraConsole);
        imprimirCentralizado(cabecalhoPedido, larguraConsole);
        imprimirCentralizado(separador, larguraConsole);
        imprimirCentralizado(cabecalhoTabela, larguraConsole);
        imprimirCentralizado(separador, larguraConsole);

        for (ItemPedido item : itens) {
            String linhaItem = montarLinhaTabela(
                    String.valueOf(item.getNumero()),
                    item.getProduto().getCodigo(),
                    item.getProduto().getDescricao(),
                    String.valueOf(item.getQuantidade()),
                    formatarMoeda(item.getProduto().getPrecoUnitario()),
                    formatarMoeda(item.obterValorTotal()));
            imprimirCentralizado(linhaItem, larguraConsole);
        }

        imprimirCentralizado(separador, larguraConsole);
        imprimirCentralizado("TOTAL: " + formatarMoeda(obterValorTotal()), larguraConsole);
        imprimirCentralizado(separador, larguraConsole);
    }

    /// =======
    /// HELPERS
    /// =======

    private String montarLinhaTabela(
            String numeroItem,
            String codigoProduto,
            String descricao,
            String quantidade,
            String valorUnitario,
            String valorTotal) {
        return String.format(
                "| %12s | %14s | %-25.25s | %10s | %17s | %17s |",
                numeroItem,
                codigoProduto,
                descricao,
                quantidade,
                valorUnitario,
                valorTotal);
    }

    private String formatarMoeda(BigDecimal valor) {
        return NumberFormat.getCurrencyInstance( Locale.of("pt", "BR")).format(valor);
    }

    private String formatarData(Date data) {
        if (data == null) {
            return "N/A";
        }
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(data);
    }

    private int obterLarguraConsole(int larguraMinima) {
        String colunas = System.getenv("COLUMNS");
        if (colunas != null) {
            try {
                return Math.max(Integer.parseInt(colunas), larguraMinima);
            } catch (NumberFormatException ignored) {
                // usa largura padrao
            }
        }
        return Math.max(LARGURA_CONSOLE_PADRAO, larguraMinima);
    }

    private void imprimirCentralizado(String texto, int larguraConsole) {
        if (texto.length() >= larguraConsole) {
            System.out.println(texto);
            return;
        }
        int espacos = (larguraConsole - texto.length()) / 2;
        System.out.println(" ".repeat(espacos) + texto);
    }

    public Pedido(int numero, Date data) {
        this.numero = numero;
        this.data = data;
    }

    /// =================
    /// GETTERS E SETTERS
    /// =================

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
