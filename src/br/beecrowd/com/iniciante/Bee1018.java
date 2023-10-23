package br.beecrowd.com.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1018 {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.US); 
        //Locale.setDefault(new Locale("pt", "BR"));//Deprecated new Locale()

        //Locale brasil = Locale.of("pt","BR");
        Locale.setDefault(Locale.of("pt","BR"));
        
        int[] schedules = {100,50, 20, 10, 5, 2, 1};
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        int times ;
        
        System.out.println(amount);
        for (int note : schedules) {
            
            times = amount / note;
            System.out.printf("%d nota(s) de R$ %.2f%n",times,(float)note);
            amount -= times * note;
        }
        in.close();
    }
}

//  beecrowd | 1018
// Cédulas

// Adaptado por Neilor Tonin, URI Brasil
// Timelimit: 1

// Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
// Entrada

// O arquivo de entrada contém um valor inteiro N (0 < N < 1_000_000).
// Saída

// Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
// Exemplo de Entrada 	Exemplo de Saída

// 576
	

// 576
// 5 nota(s) de R$ 100,00
// 1 nota(s) de R$ 50,00
// 1 nota(s) de R$ 20,00
// 0 nota(s) de R$ 10,00
// 1 nota(s) de R$ 5,00
// 0 nota(s) de R$ 2,00
// 1 nota(s) de R$ 1,00


