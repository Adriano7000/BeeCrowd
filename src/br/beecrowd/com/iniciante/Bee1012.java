package br.beecrowd.com.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
        
        String[] entrada = input.nextLine().split(" ");

        float a = Float.parseFloat(entrada[0]);
        float b = Float.parseFloat(entrada[1]);
        float c = Float.parseFloat(entrada[2]);

        triangulo = (a*c)/2;
        System.out.printf("TRIANGULO: %.3f\n",triangulo);

        circulo = pi * Math.pow(c,2);
        System.out.printf("CIRCULO: %.3f\n",circulo);

        //(B+b).h/2
        trapezio = ((a+b)*c)/2;
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);

        quadrado = Math.pow(b, 2);
        System.out.printf("QUADRADO: %.3f\n",quadrado);

        retangulo = a*b;
        System.out.printf("RETANGULO: %.3f\n",retangulo);

        input.close();
    }
}
/*
 * 
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

Exemplos de Entrada	    Exemplos de Saída
3.0 4.0 5.2

                        TRIANGULO: 7.800
                        CIRCULO: 84.949
                        TRAPEZIO: 18.200
                        QUADRADO: 16.000
                        RETANGULO: 12.000
 */