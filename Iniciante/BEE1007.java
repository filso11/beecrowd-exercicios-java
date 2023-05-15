package Iniciante;

import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        System.out.println("DIFERENCA = " + ((a * b) - (c * d)));

        entrada.close();
    }
}
