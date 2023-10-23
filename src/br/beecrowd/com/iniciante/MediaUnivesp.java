package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class MediaUnivesp {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float pesoExerc = 0.4f, pesoProva = 0.6f;
        float notaExerc, notaProva, media;

        System.out.print("Media dos Exercicios: ");
        notaExerc = in.nextFloat();
        System.out.print("Media da Prova: ");
        notaProva = in.nextFloat();

        media = (pesoExerc * notaExerc)+(pesoProva * notaProva);

        System.out.printf("Media Final = %.2f\n",media);

        in.close();
    }
    
}
