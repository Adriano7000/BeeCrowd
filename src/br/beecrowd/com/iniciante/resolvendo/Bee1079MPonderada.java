package br.beecrowd.com.iniciante.resolvendo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bee1079MPonderada {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int testes;
        String[] valores;
        double[] notas;
        ArrayList<Double> mediaPonderada = new ArrayList<>();

        testes = Integer.parseInt(in.nextLine());
        for (int i = 0; i < testes; i++) {

            valores = in.nextLine().split(" ");

            notas = Arrays.stream(valores).mapToDouble(Double::parseDouble).toArray();

            double calc = (notas[0]*2 + notas[1]*3 + notas[2]*5 ) / 10;

            mediaPonderada.add(calc);

        }
        for (double media: mediaPonderada) {
            System.out.printf("%.1f%n",media);
        }

    }

}
/**
 *
 * beecrowd | 1079
 * Médias Ponderadas
 * Adaptado por Neilor Tonin, URI  Brasil
 *
 * Timelimit: 1
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.
 *
 * Saída
 * Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 3
 * 6.5 4.3 6.2
 * 5.1 4.2 8.1
 * 8.0 9.0 10.0
 *
 * 5.7
 * 6.3
 * 9.3
 */
