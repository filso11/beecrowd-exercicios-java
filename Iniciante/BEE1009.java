package Iniciante;

import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.next();
        double salarioFixo = entrada.nextDouble();
        double totalVendas = entrada.nextDouble();

        double comissao = (totalVendas * 15 / 100);
        double totalSalario = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", totalSalario);

        entrada.close();
    }
}
