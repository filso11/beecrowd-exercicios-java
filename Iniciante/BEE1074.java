package Iniciante;

import java.util.Scanner;

public class BEE1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int valor[] = new int[entrada];

        for (int index = 0; index < entrada; index++) {
            valor[index] = sc.nextInt();
        }

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == 0) {
                System.out.println("NULL");
            } else {
                if (valor[i] % 2 == 0) {
                    if (valor[i] > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (valor[i] > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }
        sc.close();
    }
}
