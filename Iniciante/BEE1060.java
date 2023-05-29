package Iniciante;

import java.util.Scanner;

public class BEE1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                if (a > 0) {
                    positivos++;
                }
            } else if (sc.hasNextDouble()) {
                double a = sc.nextDouble();
                if (a > 0) {
                    positivos++;
                }
            }
        }

        System.out.printf("%d valores positivos\n", positivos);

    }
}