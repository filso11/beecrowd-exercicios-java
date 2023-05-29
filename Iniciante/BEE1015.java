package Iniciante;

import java.util.Scanner;

public class BEE1015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double distancia = (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", Math.sqrt(distancia));

        entrada.close();

    }

}
