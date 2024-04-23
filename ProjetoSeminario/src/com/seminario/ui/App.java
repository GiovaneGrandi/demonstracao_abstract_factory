package com.seminario.ui;

import com.seminario.ui.botoes.Botao;
import com.seminario.ui.fabricas.Fabrica;
import com.seminario.ui.janelas.Janela;

public class App {
    private Botao botao;
    private Janela janela;

    public App(Fabrica fabrica) {
        botao = fabrica.criaBotao();
        janela = fabrica.criaJanela();
    }

    public void paint() {
        botao.paint();
        janela.paint();
    }
}





