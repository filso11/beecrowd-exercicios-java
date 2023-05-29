package Iniciante;

import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double peso1 = 3.5;
        double peso2 = 7.5;

        double media = (a * peso1 + b * peso2) / (peso1 + peso2);

        System.out.printf("MEDIA = %.5f\n", media);

        entrada.close();
    }
}
