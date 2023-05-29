package Iniciante;

import java.util.Scanner;

public class BEE1035 {

    public static String check(int a, int b, int c, int d) {
        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            return "Valores aceitos";
        } else {
            return "Valores nao aceitos";
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        System.out.println(check(a, b, c, d));

        entrada.close();
    }
}
