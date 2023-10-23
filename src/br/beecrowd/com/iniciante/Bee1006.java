package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float peso1 = 2, peso2 = 3, peso3 = 5, media;
        float nota1,nota2, nota3;
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();
        media = (peso1*nota1 + peso2*nota2 + peso3*nota3)/(peso1+peso2+peso3);
        
        float mediaN = (float)((0.2*nota1)+(0.3*nota2)+(0.5*nota3));

        System.out.printf("MEDIA = %.1f\n", media);
        System.out.printf("Media = %.1f\n",mediaN);
       in.close();
    }
}
/*
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".


 */