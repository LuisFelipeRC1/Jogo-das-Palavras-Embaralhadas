package com.example;

public class MecanicaSimples implements MecanicaDoJogo {
    private int pontuacao = 0;
    private int tentativas = 0;

    @Override
    public boolean jogar(String palavraOriginal, String tentativa) {
        tentativas++;
        if (palavraOriginal.equals(tentativa)) {
            pontuacao++;
            return true;
        }
        return false;
    }

    @Override
    public boolean acabou() {
        return tentativas >= 10 || pontuacao >= 10;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }
}
