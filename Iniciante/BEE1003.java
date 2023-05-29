package Iniciante;

import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        System.out.println("SOMA = " + (a + b));

        entrada.close();

    }
}
