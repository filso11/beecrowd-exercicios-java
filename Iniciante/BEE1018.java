package Iniciante;

import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] valores = { 100, 50, 20, 10, 5, 2, 1 };

        int notas = entrada.nextInt();
        System.out.println(notas);

        for (int i = 0; i < valores.length; i++) {
            int calc = Math.abs(notas) / valores[i];
            System.out.println(calc + " nota(s) de R$ " + valores[i] + ",00");
            notas = notas % valores[i];
        }
    }

}
