package br.beecrowd.com.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] n1 = input.nextLine().split(" ");
        String[] n2 = input.nextLine().split(" ");

        double[] p1 = Arrays.stream(n1).mapToDouble(Double::parseDouble).toArray();
        double[] p2 = Arrays.stream(n2).mapToDouble(Double::parseDouble).toArray();
        
        double valor1 = Math.pow(p2[0]-p1[0],2);
        double valor2 = Math.pow(p2[1]-p1[1],2);

        double result = Math.sqrt(valor1+valor2);

        
        System.out.printf("%.4f\n",result);
       


        input.close();
        // Before using the code don't forget to import java.util.Arrays;

        // UPD: If you want to cast your array to Double[], not double[], you can use the following code:

        // Double[] doubleValues = Arrays.stream(guaranteedOutput)
        //                         .map(Double::valueOf)
        //                         .toArray(Double[]::new);
    }
}



/*beecrowd | 1015
Distância Entre Dois Pontos 
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = 

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
1.0 7.0             4.4721
5.0 9.0 */
