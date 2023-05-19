package Iniciante;

import java.util.Scanner;

public class BEE1044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int inverte;

        if (b > a) {
            inverte = b;
            b = a;
            a = inverte;
        }

        if (a % b == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }
}
