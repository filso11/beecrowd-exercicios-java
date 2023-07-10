package Iniciante;

import java.util.Scanner;

public class BEE1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasValidas = 0;
        double media = 0;

        while (true) {
            double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notasValidas++;
                media += nota;
                if (notasValidas == 2) {
                    System.out.println("media = " + media / 2);
                    System.out.println("novo calculo (1-sim 2-nao)");
                    int novoCalculo = sc.nextInt();
                    switch (novoCalculo) {
                        case 1:
                            notasValidas = 0;
                        case 2:
                            break;

                        default:
                            break;
                    }
                }
            } else {
                System.out.println("nota invalida");
            }
        }
        // sc.close();
    }
}
