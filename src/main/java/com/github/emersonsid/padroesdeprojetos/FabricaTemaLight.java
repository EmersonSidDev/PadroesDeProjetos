package com.github.emersonsid.padroesdeprojetos;

public class FabricaTemaLight implements FabricaTemas {
    @Override
    public Button criarBotao() {
        return new LightButton();
    }

    @Override
    public CheckBox criarCheckBox() {
        return new LightCheckBox();
    }
}
