package br.beecrowd.com.iniciante.resolvendo;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Bee1094Experiencia {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int entrada;
        int total = 0, rato = 0, sapo = 0, coelho = 0;
        float ratoP, sapoP, coelhoP;
        String mensagem = """
                Total: %d cobaias
                Total de coelhos: %d
                Total de ratos: %d
                Total de sapos: %d
                Percentual de coelhos: %.2f %%
                Percentual de ratos: %.2f %%
                Percentual de sapos: %.2f %%
                """;

        entrada = Integer.parseInt(in.nextLine());
        for (int i = 0; i < entrada; i++) {
            String[] valor = in.nextLine().split(" ");

            total += Integer.parseInt(valor[0]);
            switch (valor[1]) {
                case "C" -> coelho += Integer.parseInt(valor[0]);
                case "R" -> rato += Integer.parseInt(valor[0]);
                case "S" -> sapo += Integer.parseInt(valor[0]);
            }
        }
        coelhoP = (float) coelho / total * 100;
        ratoP = (float) rato / total * 100;
        sapoP = (float) sapo / total * 100;

        System.out.printf(Locale.US,mensagem, total, coelho, rato, sapo, coelhoP, ratoP, sapoP);

    }
}

/**
 * beecrowd | 1094
 * Experiências
 * Adaptado por Neilor Tonin, URI  Brasil
 * <p>
 * Timelimit: 1
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
 * <p>
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
 * <p>
 * Entrada
 * A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
 * <p>
 * Saída
 * Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * 10
 * 10 C
 * 6 R
 * 15 S
 * 5 C
 * 14 R
 * 9 C
 * 6 R
 * 8 S
 * 5 C
 * 14 R
 * <p>
 * Total: 92 cobaias
 * Total de coelhos: 29
 * Total de ratos: 40
 * Total de sapos: 23
 * Percentual de coelhos: 31.52 %
 * Percentual de ratos: 43.48 %
 * Percentual de sapos: 25.00 %
 */