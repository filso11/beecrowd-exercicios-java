package Iniciante;

import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        if (entrada % 2 != 0) {
            System.out.println(entrada);
            for (int i = 0; i < 5; i++) {
                entrada += 2;
                System.out.println(entrada);
            }
        } else {
            entrada += 1;
            System.out.println(entrada);
            for (int i = 0; i < 5; i++) {
                entrada += 2;
                System.out.println(entrada);
            }

        }
        sc.close();
    }
}
