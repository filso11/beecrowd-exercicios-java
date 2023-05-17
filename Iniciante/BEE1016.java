package Iniciante;

import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();

        System.out.println((60 * a) / 30 + " minutos");

        entrada.close();
    }
}
