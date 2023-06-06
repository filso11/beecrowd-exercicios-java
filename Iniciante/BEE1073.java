package Iniciante;

import java.util.Scanner;

public class BEE1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int n = 0;

        for (int i = 1; i <= entrada; i++) {
            if (i % 2 == 0) {
                n += (int) Math.sqrt(i);
                int y = i * i;
                System.out.printf("%d^2 = %d\n", i, y);
            }
        }

        sc.close();
    }
}
