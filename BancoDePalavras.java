package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
    private ArrayList<String> palavras;

    public BancoDePalavras(String caminho) throws IOException {
        palavras = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha;
            while ((linha = br.readLine()) !=null) {
                palavras.add(linha.trim());
                
            }

        }
    }
    public String getPalavraAleatoria(){
        Random random = new Random();
        return palavras.get(random.nextInt(palavras.size()));
    }

}
