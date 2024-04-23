package com.seminario.ui.fabricas;

import com.seminario.ui.botoes.Botao;
import com.seminario.ui.janelas.Janela;

public interface Fabrica {
    Botao criaBotao();
    Janela criaJanela();
}




