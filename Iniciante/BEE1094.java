package Iniciante;

import java.util.Scanner;

public class BEE1094 {

    public static String entrada() {
        Scanner tl = new Scanner(System.in);
        String a = tl.nextLine();
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < casos; i++) {
            String[] valores = entrada().split(" ");
            String tipo = valores[1].toUpperCase();
            int quantidade = Integer.parseInt(valores[0]);

            switch (tipo) {
                case "C":
                    coelhos += quantidade;
                    total += quantidade;
                    break;

                case "R":
                    ratos += quantidade;
                    total += quantidade;
                    break;

                case "S":
                    sapos += quantidade;
                    total += quantidade;
                    break;

                default:
                    break;
            }

        }
        double perCoelhos = ((double) coelhos / total) * 100;
        double perRatos = ((double) ratos / total) * 100;
        double perSapos = ((double) sapos / total) * 100;

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", perCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", perRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", perSapos);

        sc.close();
    }
}
