package com.seminario.ui.fabricas;

import com.seminario.ui.botoes.Botao;
import com.seminario.ui.botoes.BotaoMac;
import com.seminario.ui.janelas.Janela;
import com.seminario.ui.janelas.JanelaMac;

public class FabricaMac implements Fabrica{
    @Override
    public Botao criaBotao() {
        return new BotaoMac();
    }

    @Override
    public Janela criaJanela() {
        return new JanelaMac();
    }
}






