package Iniciante;

import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int segundos = entrada.nextInt();

        int hora = segundos / 3600;

        segundos %= 3600;

        int minuto = segundos / 60;

        segundos %= 60;

        System.out.printf("%d:%d:%d\n", hora, minuto, segundos);

        entrada.close();

    }
}
