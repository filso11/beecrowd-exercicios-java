package Iniciante;

import java.util.Scanner;

public class BEE1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasValidas = 0;
        double mediaNotas = 0;

        while (true) {
            double notas = sc.nextDouble();
            if (notas >= 0 && notas <= 10) {
                notasValidas++;
                mediaNotas += notas;
                if (notasValidas == 2) {
                    System.out.println("media = " + mediaNotas / 2);
                    break;
                }
            } else {
                System.out.println("nota invalida");
            }

        }

        sc.close();

    }
}
