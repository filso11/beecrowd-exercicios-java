package Iniciante;

import java.util.Scanner;

public class BEE1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % entrada == 2) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
