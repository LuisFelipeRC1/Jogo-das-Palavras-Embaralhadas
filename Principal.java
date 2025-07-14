package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException{
         BancoDePalavras banco = new BancoDePalavras("palavras.txt.txt");
         Embaralhador embaralhador = new EmbaralhadorAleatorio();
         MecanicaDoJogo mecanica = new MecanicaSimples();
         try (Scanner sc = new Scanner(System.in)) {
            while(!mecanica.acabou() ){
                String palavra = banco.getPalavraAleatoria();
                String palavraEmbaralhada = embaralhador.embaralhar(palavra);

                System.out.println("Adivinhe a palavra emparalhada" +  "  " + palavraEmbaralhada);
                String tentativa = sc.nextLine();
                if(mecanica.jogar(palavra, tentativa)){
                    System.out.println("Você acertou");
                }else{
                    System.out.println("Tente novamente");
                }
             }
        }
         System.out.println("Fim do jogo! Pontuação final= "  + mecanica.getPontuacao() );

        
    }

}
