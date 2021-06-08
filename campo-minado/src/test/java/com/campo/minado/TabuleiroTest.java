package com.campo.minado;

import org.junit.Test;

public class TabuleiroTest {
    @Test
    public void TabuleiroEmModoDeTeste() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setModoDeTeste(true);
        tabuleiro.setColuna(1);
        tabuleiro.setLinha(1);
    }
}
