package Iniciante;

import java.util.Scanner;

public class BEE1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAnterior = 0, numeroMaior = 0, posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int entrada = sc.nextInt();
            if (entrada > numeroMaior) {
                numeroMaior = entrada;
                numeroAnterior = entrada;
                posicao = i;
            } else {
                numeroAnterior = entrada;
            }

        }
        System.out.println(numeroMaior);
        System.out.println(posicao);

        sc.close();
    }
}
