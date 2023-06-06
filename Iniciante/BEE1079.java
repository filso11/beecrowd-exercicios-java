package Iniciante;

import java.util.Scanner;

public class BEE1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        double[] valores = new double[casos * 3];

        for (int i = 0; i < valores.length; i++) {
            String valor = sc.nextLine();
            String[] valoreseee = valor.split(" ");
            for (int j = 0; j < valoreseee.length; j++) {
                System.out.println(valoreseee[j]);
            }

        }

        sc.close();
    }
}
