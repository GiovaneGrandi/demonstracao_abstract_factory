package com.seminario.ui.fabricas;

import com.seminario.ui.botoes.Botao;
import com.seminario.ui.botoes.BotaoWindows;
import com.seminario.ui.janelas.Janela;
import com.seminario.ui.janelas.JanelaWindows;

public class FabricaWindows implements Fabrica{
    @Override
    public Botao criaBotao() {
        return new BotaoWindows();
    }

    @Override
    public Janela criaJanela() {
        return new JanelaWindows();
    }
}
