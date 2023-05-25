package Iniciante;

import java.util.Scanner;

public class BEE1050 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        String saida = "";

        int[] ddd = { 61, 71, 11, 21, 32, 19, 27, 31 };
        String[] destino = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora",
                "Campinas",
                "Vitoria", "Belo Horizonte" };

        for (int i = 0; i < ddd.length; i++) {
            if (a == ddd[i]) {
                saida = destino[i];
            }
        }

        if (saida.isEmpty()) {
            System.out.println("DDD nao cadastrado");
        }
        System.out.println(saida);
        entrada.close();
    }
}
