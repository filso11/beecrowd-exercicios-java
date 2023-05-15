package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class BEE1002 {
    public static void main(String[] args) throws IOException {

        double n = 3.14159;

        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();

        double area = n * (raio * raio);

        System.out.printf("A=%.4f\n", area);

        entrada.close();
    }
}
