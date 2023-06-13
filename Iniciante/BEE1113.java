package Iniciante;

import java.util.Scanner;

public class BEE1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X == Y) {
                break;
            } else if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }

        sc.close();
    }
}
