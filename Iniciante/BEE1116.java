package Iniciante;

import java.util.Scanner;

public class BEE1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Quantidade de pares de valores a serem lidos

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (Y != 0) {
                double resultado = (double) X / Y;
                System.out.printf("%.1f\n", resultado);
            } else {
                System.out.println("divisao impossivel");
            }
        }

        sc.close();

    }
}
