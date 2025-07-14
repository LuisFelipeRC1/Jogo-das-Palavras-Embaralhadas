package com.example;

public interface MecanicaDoJogo {

    boolean jogar(String palavraOriginal, String tentativa);
    boolean acabou();
    int getPontuacao();

}
