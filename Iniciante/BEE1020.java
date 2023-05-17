package Iniciante;

import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dias = entrada.nextInt();

        int anos = dias / 365;

        dias %= 365;

        int meses = dias / 30;

        dias %= 30;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);

        entrada.close();
    }
}
