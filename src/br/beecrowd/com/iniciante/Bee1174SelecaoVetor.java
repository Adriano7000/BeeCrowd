package br.beecrowd.com.iniciante;

import java.io.IOException;
import java.util.Scanner;
 

public class Bee1174SelecaoVetor {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);
      float[] vetor = new float[100];
      

      for (int i = 0; i < vetor.length; i++) {
        vetor[i] = Float.parseFloat(in.nextLine());

      }
      for (int i = 0; i < vetor.length; i++) {
        if(vetor[i] <= 10){
            System.out.printf("A[%d] = %.1f\n",i,vetor[i]);
        }
      }
      in.close();
 
    }
 
}
/*
 * beecrowd | 1174
Seleçao em Vetor I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
0
-5
63
-8.5
...

A[0] = 0.0
A[1] = -5.0
A[3] = -8.5
...
 */