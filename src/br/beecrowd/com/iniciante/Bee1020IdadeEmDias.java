package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class Bee1020IdadeEmDias {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idadeDias = in.nextInt();
        //365, 30
        int[] diasDividido = {365,30};
        int[] value = new int[diasDividido.length];
        String result = """
                %d ano(s)
                %d mes(es)
                %d dia(s)              
                """;

        for (int i=0;i< diasDividido.length;i++){
            value[i] = idadeDias / diasDividido[i];
            idadeDias -= (value[i]*diasDividido[i]);
        }

        System.out.printf(result,value[0],value[1],idadeDias);
        in.close();
    }
}
/**
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
400                 1 ano(s)
                    1 mes(es)
                    5 dia(s)
 */