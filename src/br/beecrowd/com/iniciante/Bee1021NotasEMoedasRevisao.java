package br.beecrowd.com.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1021NotasEMoedasRevisao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double money = in.nextDouble();

        // double[] notas = {100,50,20,10,5,2,1.00,0.5,0.25,0.10,0.05,0.01};
        //Multiplicado as moedas por 100
        double[] notas = {100,50,20,10,5,2,100,50,25,10,5,1};
        double quantNotasEMoedas;

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length-6; i++) {
            quantNotasEMoedas = (int)(money / notas[i]);
            money %= notas[i];

            System.out.printf("%.0f nota(s) de R$ %.2f%n",quantNotasEMoedas,notas[i]);
        }

        System.out.println("MOEDAS:");
        money = Math.round(money*100);
        for (int i = 6; i < notas.length; i++) {
            quantNotasEMoedas =(int) (money / notas[i]);
            money %= notas[i];

            //Convertendo moedas para valor de centavos dividindo por 100
            System.out.printf("%.0f moeda(s) de R$ %.2f%n",quantNotasEMoedas,notas[i]/100);
        }
        
        in.close();
    }
}
