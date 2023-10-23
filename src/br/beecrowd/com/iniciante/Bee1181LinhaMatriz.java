package br.beecrowd.com.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1181LinhaMatriz {
 

        public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        int linha ;
        char letra;

        linha = Integer.parseInt(in.nextLine());
        letra =  in.nextLine().charAt(0);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Double.parseDouble(in.nextLine());
            }
        }
        switch (letra){
            case 'S' -> System.out.printf("%.1f\n",soma(matriz,linha));
            case 'M' -> System.out.printf("%.1f\n",media(matriz,linha));
        }
       
        in.close();
 
    }

    static public double soma(double[][] matriz, int linha) {
        double total = 0;
        for (int c = 0; c < matriz[linha].length; c++) {
            total += matriz[linha][c];
        }
        return total;
    }

    static public double media(double[][] matriz, int linha){
        double media = 0;
        for (int c = 0; c < matriz[linha].length; c++) {
            media += matriz[linha][c];
        }
        return media/ matriz[linha].length;
    }
}

/*
 * beecrowd | 1181
Linha na Matriz
Por Neilor Tonin, URI  Brasil

Timelimit: 1
Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 2 para a linha da matriz, demonstrando os elementos que deverão ser considerados na operação.

Entrada
A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz, sendo que a mesma é preenchida linha por linha, da linha 0 até a linha 11, sempre da esquerda para a direita.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
2
S
0.0
-3.5
2.5
4.1
...

12.6
 */