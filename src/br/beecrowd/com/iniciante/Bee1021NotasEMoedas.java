package br.beecrowd.com.iniciante;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bee1021NotasEMoedas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        NumberFormat fmt = new DecimalFormat("#0.00");
        
        float[] notas = {100,50,20,10,5,2,1.00f,0.5f,0.25f,0.10f,0.05f,0.01f};
        float[] quantNotasEMoedas = new float[notas.length];
        
        Scanner in = new Scanner(System.in);
        float money = in.nextFloat();

        for (int i = 0; i < notas.length; i++) {

            quantNotasEMoedas[i] = (int)(money / notas[i]);
            money -= quantNotasEMoedas[i]*notas[i] ;

            money = Float.parseFloat(fmt.format(money));
            //money = Math.round(money*100.0f)/100.0f;

        }
        //==================================================
        //=========== IMPRESSÃO ============================
        //==================================================
        System.out.println("NOTAS:");
        for (int i = 0; i < quantNotasEMoedas.length-6; i++) {
            System.out.printf("%.0f nota(s) de R$ %.2f%n",quantNotasEMoedas[i],notas[i]); 
            
        }
 
        System.out.println("MOEDAS:");
        for (int i = 6; i <= quantNotasEMoedas.length-1; i++) {
            System.out.printf("%.0f moeda(s) de R$ %.2f%n",quantNotasEMoedas[i],notas[i]);
        }
       
        in.close();
    }
}
/*
 * 
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1_000_000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada	Exemplo de Saída

576.73              NOTAS:
                    5 nota(s) de R$ 100.00
                    1 nota(s) de R$ 50.00
                    1 nota(s) de R$ 20.00
                    0 nota(s) de R$ 10.00
                    1 nota(s) de R$ 5.00
                    0 nota(s) de R$ 2.00
                    MOEDAS:
                    1 moeda(s) de R$ 1.00
                    1 moeda(s) de R$ 0.50
                    0 moeda(s) de R$ 0.25
                    2 moeda(s) de R$ 0.10
                    0 moeda(s) de R$ 0.05
                    3 moeda(s) de R$ 0.01
 */
