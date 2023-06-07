package Iniciante;

import java.util.Scanner;

public class BEE1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        double[] valores = new double[casos];

        for (int i = 0; i < casos; i++) {
            valores[i] = sc.nextDouble();
            System.out.println(valores[i]);
        }

        sc.close();
    }
}
