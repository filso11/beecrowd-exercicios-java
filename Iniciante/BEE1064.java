package Iniciante;

import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double entrada[] = new double[6];
        double media = 0;
        int valores = 0;

        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = sc.nextDouble();
            if (entrada[i] > 0) {
                valores++;
                media += entrada[i];
            }
        }

        media = media / valores;
        System.out.printf("%d valores positivos\n%.1f\n", valores, media);

        sc.close();
    }
}
