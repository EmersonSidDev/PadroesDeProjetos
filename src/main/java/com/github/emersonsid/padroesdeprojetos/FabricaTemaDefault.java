package com.github.emersonsid.padroesdeprojetos;

public class FabricaTemaDefault implements FabricaTemas {
    @Override
    public Button criarBotao() {
        return new DefaultButton();
    }

    @Override
    public CheckBox criarCheckBox() {
        return new DefaultCheckBox();
    }
}
