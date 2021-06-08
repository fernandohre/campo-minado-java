package com.campo.minado;

import org.junit.Assert;
import org.junit.Test;

public class TabuleiroTest {
    @Test
    public void ParticionamentoEquivalenciaLinhaInvalida() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setModoDeTeste(true);
        tabuleiro.setLinha(0);
        Assert.assertTrue("Valores de 1 a 8 para linha.", tabuleiro.getLinha() == 0);
    }

    @Test
    public void ParticionamentoEquivalenciaColunaInvalida() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setModoDeTeste(true);
        tabuleiro.setColuna(9);
        Assert.assertTrue("Valores de 1 a 8 para coluna", tabuleiro.getColuna() == 9);
    }

    @Test
    public void ParticionamentoEquivalenciaLinhaInvalidaColunaValida() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setModoDeTeste(true);
        tabuleiro.setLinha(0);
        tabuleiro.setColuna(8);
        Assert.assertFalse(tabuleiro.setPosicao());
    }

    @Test
    public void ParticionamentoEquivalenciaColunaInvalidaELinhaInvalida() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setModoDeTeste(true);
        tabuleiro.setLinha(0);
        tabuleiro.setColuna(9);
        Assert.assertFalse(tabuleiro.setPosicao());
    }

}
