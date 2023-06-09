package Iniciante;

import java.util.Scanner;

public class BEE1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int somaImpares = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X > Y) {
                Y++;
                for (int j = Y; j < X; j++) {
                    if (j % 2 != 0) {
                        somaImpares += j;
                    }
                }
                System.out.println(somaImpares);

            } else if (X == Y) {
                somaImpares = 0;
                System.out.println(somaImpares);
            } else {
                X++;
                for (int j = X; j < Y; j++) {
                    if (j % 2 != 0) {
                        somaImpares += j;
                    }
                }
                System.out.println(somaImpares);
            }
            somaImpares = 0;
        }
        sc.close();
    }
}
