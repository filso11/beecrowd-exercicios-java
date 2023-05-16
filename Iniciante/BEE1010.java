package Iniciante;

import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura da primeira linha de entrada
        int codigoPeca1 = entrada.nextInt();
        int numeroPecas1 = entrada.nextInt();
        double valorUnitarioPeca1 = entrada.nextDouble();

        // Leitura da segunda linha de entrada
        int codigoPeca2 = entrada.nextInt();
        int numeroPecas2 = entrada.nextInt();
        double valorUnitarioPeca2 = entrada.nextDouble();

        double totalPagar = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

        entrada.close();
    }
}
