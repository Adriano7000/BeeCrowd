package br.beecrowd.com.iniciante.resolvendo;
import java.io.IOException;

import java.util.Scanner;

public class Bee1072Intervalo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int in = 0, out = 0;
        String mensagem = """
                %d in
                %d out
                """;

        int vezes = Integer.parseInt(input.nextLine());
        for (int i = 0; i < vezes; i++) {
            int valor = Integer.parseInt(input.nextLine());
            if (valor >= 10 && valor <= 20) {in++; } else {out++; }
        }
        System.out.printf(mensagem,in,out);
    }
}
/**
 * beecrowd | 1072
 * Intervalo 2
 * Adaptado por Neilor Tonin, URI  Brasil
 *
 * Timelimit: 1
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
 *
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 *
 *
 * Saída
 * Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 *
 *
 */