package Iniciante;

import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, soma = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x == y) {
            System.out.println(soma);
        } else {
            if (x > y) {
                for (int i = y + 1; i < x; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            } else {
                for (int i = x + 1; i < y + 1; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            }
            System.out.println(soma);
        }

        sc.close();
    }
}
