package Iniciante;

import java.util.Scanner;

public class BEE1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int soma = 0;

            if (num1 <= 0 || num2 <= 0) {
                break;
            } else {
                if (num1 > num2) {
                    for (int i = num2; i <= num1; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.print("Sum=" + soma + "\n");
                } else {
                    for (int i = num1; i <= num2; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.print("Sum=" + soma + "\n");
                }
            }
        }

        sc.close();
    }
}
