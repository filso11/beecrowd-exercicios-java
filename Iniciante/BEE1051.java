package Iniciante;

import java.util.Scanner;

public class BEE1051 {

    public static double calculaImposto(double valor) {
        double impostoTotal = 0;
        double imposto, resto;

        if (valor > 4500.00) {
            imposto = (1000 * 0.08) + (1500 * 0.18);
            resto = valor - 4500;
            impostoTotal = imposto + (resto * 0.28);
            return impostoTotal;
        } else if (valor <= 4500 && valor > 3000) {
            imposto = 1000 * 0.08;
            resto = valor - 3000;
            impostoTotal = imposto + (resto * 0.18);
            return impostoTotal;
        } else if (valor <= 3000 && valor > 2000) {
            resto = valor - 2000;
            impostoTotal = resto * 0.08;
            return impostoTotal;
        }
        return impostoTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        String isento = "Isento";

        double saida;

        if (salario < 2000) {
            System.out.println(isento);
        } else {
            saida = calculaImposto(salario);
            System.out.printf("R$ %.2f\n", saida);
        }

        sc.close();
    }
}
