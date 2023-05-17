package Iniciante;

import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempo = entrada.nextInt();
        int velocidade = entrada.nextInt();
        double litros = (tempo * velocidade) / 12.0;

        System.out.printf("%.3f\n", litros);

        entrada.close();
    }
}
