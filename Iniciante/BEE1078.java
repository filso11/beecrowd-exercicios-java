package Iniciante;

import java.util.Scanner;

public class BEE1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i * entrada;
            System.out.println(i + " x " + entrada + " = " + resultado);
        }

        sc.close();
    }
}
