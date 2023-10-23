package br.beecrowd.com.iniciante;

import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        
        float nota1, nota2, media;
        Scanner in = new Scanner(System.in);
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        //3.4 e 7.5
        media = (float)((nota1*3.5 + nota2 * 7.5)/(3.5+7.5));

        System.out.printf("MEDIA = %.5f\n",media);
        in.close();
    }
}
