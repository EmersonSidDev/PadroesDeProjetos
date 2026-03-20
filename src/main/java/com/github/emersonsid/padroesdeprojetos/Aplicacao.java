package com.github.emersonsid.padroesdeprojetos;

public class Aplicacao {
    private Button botao;
    private CheckBox checkBox;

    public Aplicacao(FabricaTemas fabrica){
        botao = fabrica.criarBotao();
        checkBox = fabrica.criarCheckBox();
    }

    public void renderizarInterface(){
        botao.criarButao();
        checkBox.criarCheckBox();
    }
}
