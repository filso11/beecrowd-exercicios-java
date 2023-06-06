package Iniciante;

import java.util.Scanner;

public class BEE1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada[] = new int[5];
        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = sc.nextInt();
            if (entrada[i] % 2 == 0) {
                pares++;
                if (entrada[i] > 0) {
                    positivos++;
                } else if (entrada[i] < 0) {
                    negativos++;
                }
            } else if (entrada[i] % 2 != 0) {
                impares++;
                if (entrada[i] > 0) {
                    positivos++;
                } else if (entrada[i] < 0) {
                    negativos++;
                }
            }
        }

        System.out.printf(
                "%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",
                pares,
                impares, positivos, negativos);

        sc.close();
    }
}
