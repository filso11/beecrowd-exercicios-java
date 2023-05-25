package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextDouble();
        double novoSalario = 0;
        double reajuste = 0;
        int porcentagem = 0;

        if (salario <= 400) {
            porcentagem = 15;
            reajuste = (salario * porcentagem) / 100;
            novoSalario = salario + reajuste;
        } else if (salario > 400 && salario <= 800) {
            porcentagem = 12;
            reajuste = (salario * porcentagem) / 100;
            novoSalario = salario + reajuste;
        } else if (salario > 800 && salario <= 1200) {
            porcentagem = 10;
            reajuste = (salario * porcentagem) / 100;
            novoSalario = salario + reajuste;
        } else if (salario > 1200 && salario <= 2000) {
            porcentagem = 7;
            reajuste = (salario * porcentagem) / 100;
            novoSalario = salario + reajuste;
        } else {
            porcentagem = 4;
            reajuste = (salario * porcentagem) / 100;
            novoSalario = salario + reajuste;
        }
        System.out.printf(Locale.US, "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario,
                reajuste,
                porcentagem);

        entrada.close();
    }
}
