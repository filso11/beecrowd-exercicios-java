package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int item = entrada.nextInt();
        int quantidade = entrada.nextInt();
        double total;

        switch (item) {
            case 1:
                total = quantidade * 4.00;
                System.out.printf(Locale.US, "Total: R$ %.2f\n", total);

                break;

            case 2:
                total = quantidade * 4.50;
                System.out.printf(Locale.US, "Total: R$ %.2f\n", total);
                break;

            case 3:
                total = quantidade * 5.00;
                System.out.printf(Locale.US, "Total: R$ %.2f\n", total);
                break;

            case 4:
                total = quantidade * 2.00;
                System.out.printf(Locale.US, "Total: R$ %.2f\n", total);
                break;

            case 5:
                total = quantidade * 1.50;
                System.out.printf(Locale.US, "Total: R$ %.2f\n", total);
                break;

            default:
                break;
        }
        entrada.close();
    }
}
