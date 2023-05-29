package Iniciante;

import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double media = (a * pesoA + b * pesoB + c * pesoC) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();
    }
}
