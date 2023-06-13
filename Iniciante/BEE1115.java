package Iniciante;

import java.util.Scanner;

public class BEE1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            } else {
                break;
            }
        }
        sc.close();
    }
}
