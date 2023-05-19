package Iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class BEE1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = entrada.nextInt();
        }

        int[] valoresOrdenados = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valoresOrdenados);

        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }

        System.out.println();

        for (int valor : valores) {
            System.out.println(valor);
        }

        entrada.close();

    }
}