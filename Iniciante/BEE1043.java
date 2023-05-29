package Iniciante;

import java.util.Scanner;

public class BEE1043 {

    public static Boolean verificaTriangulo(double a, double b, double c) {

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("Perimetro = " + (a + b + c));
                return true;
            } else {
                System.out.println("Area = " + ((a + b) * c / 2));
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        verificaTriangulo(a, b, c);
        entrada.close();
    }
}
