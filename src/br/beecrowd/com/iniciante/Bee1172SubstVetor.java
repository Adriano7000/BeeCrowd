package br.beecrowd.com.iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Bee1172SubstVetor {
 
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        int valor;

        for (int i = 0; i < vetor.length; i++) {

            valor = Integer.parseInt(in.nextLine());
            vetor[i] = (valor < 1) ? 1 : valor;

        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("X[%d] = %d\n",i,vetor[i]);
        }
        in.close();
    }
 
}

/*
 * beecrowd | 1172
Substituição em Vetor I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

Exemplo de Entrada	Exemplo de Saída
0
-5
63
0
...

X[0] = 1
X[1] = 1
X[2] = 63
X[3] = 1
...
 */