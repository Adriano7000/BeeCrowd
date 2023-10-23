package br.beecrowd.com.iniciante.resolvendo;

import java.util.Scanner;

public class Bee1080MPosicao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor =0;
        int maior = 0;
        int posicao = 1;

        //A quantidade de loops é 100
        for (int i = 1; i <= 4; i++) {
            valor = in.nextInt();
            if(maior < valor) {
                maior = valor;
                posicao = i;
            }
        }

        System.out.printf("%d\n%d\n",maior,posicao);
    }
}
/**
 * beecrowd | 1080
 * Maior e Posição
 * Adaptado por Neilor Tonin, URI  Brasil
 *
 * Timelimit: 1
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 *
 * Entrada
 * O arquivo de entrada contém 100 números inteiros, positivos e distintos.
 *
 * Saída
 * Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */