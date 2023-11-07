package br.beecrowd.com.iniciante.resolvendo;

import java.util.Arrays;
import java.util.Scanner;

public class Bee1044Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean multiplo;

        String[] valor = sc.nextLine().split(" ");
        //double[] num = Arrays.stream(valor).mapToDouble(Double::parseDouble).toArray();

        if (num[0] <= num[1]) {
            multiplo = (num[1] % num[0] == 0);
        } else {
            multiplo = (num[0] % num[1] == 0);
        }

        if (multiplo == true) {
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }


    }
}
/***
 * Múltiplos
 * Adaptado por Neilor Tonin, URI  Brasil
 *
 * Timelimit: 1
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 *
 * Entrada
 * A entrada contém valores inteiros.
 *
 * Saída
 * A saída deve conter uma das mensagens conforme descrito acima.
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 6 24
 *
 * Sao Multiplos
 *
 * 6 25
 *
 * Nao sao Multiplos
 */
