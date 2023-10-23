package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class Bee1013 {


    static int maior(int x, int y){
        return (x+y+Math.abs(x-y))/2;
    }

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String[] data = input.nextLine().split(" ");

    int a, b, c, num;
    a = Integer.parseInt(data[0]);
    b = Integer.parseInt(data[1]);
    c = Integer.parseInt(data[2]);

    num = maior(a,b);
    num = maior(num,c);
    System.out.printf("%d eh o maior\n",num);

    input.close();
    
    }
}

/*
 * 
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

maiorAB = (a+b+abs(a-b))/2



Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada	        Exemplos de Saída
7 14 106                    106 eh o maior

217 14 6                    217 eh o maior


 */