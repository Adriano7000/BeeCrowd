package br.beecrowd.com.iniciante;
import java.util.Scanner;

//Mudar o nome da classe para Main
public class Bee1004 {

  public static void main(String[] args) {
   
    Scanner in = new Scanner(System.in);
    short a, b;
    a = in.nextShort();
    b = in.nextShort();
    int prod = a * b;
    System.out.printf("PROD = %d\n",prod);

    in.close();

  }
}
