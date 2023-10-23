package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class Bee1066Pares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int par =0;
        int impar=0 ;
        int negativo=0;
        int positivo=0;
        String resultado = """
                %d valor(es) par(es)
                %d valor(es) impar(es)
                %d valor(es) positivo(s)
                %d valor(es) negativo(s)
                """;

        for (int i = 0; i < 5; i++) {
            int valor = Integer.parseInt(in.nextLine());
            if (valor % 2 == 0) {par++; } else {impar++; }
            if (valor > 0) { positivo++; }
            if (valor < 0) { negativo++; }
        }
        System.out.printf(resultado,par,impar,positivo,negativo);

        in.close();
    }
}

/**
 beecrowd | 1066
 Pares, Ímpares, Positivos e Negativos
 Adaptado por Neilor Tonin, URI  Brasil

 Timelimit: 1
 Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

 Entrada
 O arquivo de entrada contém 5 valores inteiros quaisquer.

 Saída
 Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
 **/
