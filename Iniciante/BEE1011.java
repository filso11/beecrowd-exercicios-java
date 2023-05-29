package Iniciante;

import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double pi = 3.14159;
        double raio = entrada.nextDouble();

        double volume = (4.0 / 3) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);

        entrada.close();
    }
}