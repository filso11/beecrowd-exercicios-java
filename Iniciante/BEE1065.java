package Iniciante;

import java.util.Scanner;

public class BEE1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada[] = new int[5];
        int pares = 0;

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = sc.nextInt();
            if (entrada[i] % 2 == 0) {
                pares++;
            }

        }

        System.out.printf("%d valores pares\n", pares);

        sc.close();
    }
}
