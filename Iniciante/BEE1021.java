package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valor = entrada.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        int[] notas = { 10000, 5000, 2000, 1000, 500, 200 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");

        for (int i = 0; i < notas.length; i++) {
            int calc = centavos / notas[i];
            System.out.printf(Locale.US, "%d nota(s) de R$ %.2f\n", calc, notas[i] / 100.0);
            centavos %= notas[i];
        }

        System.out.println("MOEDAS:");

        for (int i = 0; i < moedas.length; i++) {
            int calc = centavos / moedas[i];
            System.out.printf(Locale.US, "%d moeda(s) de R$ %.2f\n", calc, moedas[i] / 100.0);
            centavos %= moedas[i];
        }
    }
}
