package com.seminario.ui;

import com.seminario.ui.fabricas.Fabrica;
import com.seminario.ui.fabricas.FabricaMac;

public class Main {
    public static void main(String[] args) {
        Fabrica fabricaTeste = new FabricaMac();

        App teste = new App(fabricaTeste);

        teste.paint();
    }
}