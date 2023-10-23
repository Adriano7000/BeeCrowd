package br.beecrowd.com.iniciante;

import java.util.Scanner;

class Bee1019{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();

        int[] time = {3600,60};
        int[] result = new int[time.length] ;
        int value = 0;

        for (int i = 0; i < time.length; i++) {
            value = seconds / time[i];
            result[i] = value;
            seconds -= (time[i]*value);
        }
         //D:H:M:S
        //D == 86400
        System.out.printf("%d:%d:%d%n",result[0],result[1],seconds);
        
        in.close();
    }
}






/***
 * 
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada	    Exemplo de Saída
556                     0:9:16
 * 
 */