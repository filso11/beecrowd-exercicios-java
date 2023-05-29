package Iniciante;

import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroFuncionario = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double valorPorHora = entrada.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        entrada.close();

    }
}
