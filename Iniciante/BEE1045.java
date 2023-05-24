package Iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double[] maior = { a, b, c };

        Arrays.sort(maior);

        a = maior[2];
        b = maior[1];
        c = maior[0];

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((Math.pow(a, 2)) == (Math.pow(b, 2)) + (Math.pow(c, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        } else if ((a * a) > (b * b) + (c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((a * a) < (b * b) + (c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        entrada.close();

    }
}
