package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class Bee1014 {

    static float consumo(int distance, float fuel){
        return distance / fuel;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int distance = input.nextInt();
        float fuel = input.nextFloat();

        String resposta = "%.3f km/l\n";

        System.out.printf(resposta,consumo(distance, fuel));
        input.close();
    }
}

/*beecrowd | 1014
Titulo: Consumo
 * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

Exemplo de Entrada	    Exemplo de Saída
500                     14.286 km/l
35.0
 * 
 */