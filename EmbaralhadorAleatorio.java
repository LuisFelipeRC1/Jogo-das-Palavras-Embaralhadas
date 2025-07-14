package com.example;

import java.util.Random;

public class EmbaralhadorAleatorio implements Embaralhador {
    @Override
    public String embaralhar(String palavra){
        char[] letras = palavra.toCharArray();
        Random random = new Random();
        for ( int i =0; i< letras.length; i++){
            
            int indiceAleatorio = random.nextInt(letras.length);
            char aux = letras[i];
            letras[i] = letras[indiceAleatorio];
            letras[indiceAleatorio] = aux;
        }
        return new String(letras);
        
    }

  
   
}
