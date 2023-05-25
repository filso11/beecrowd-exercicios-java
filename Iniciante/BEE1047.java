package Iniciante;

import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicio = entrada.nextInt();
        int minutoInicio = entrada.nextInt();
        int horaFim = entrada.nextInt();
        int minutoFim = entrada.nextInt();

        int horasTotais, minutosTotais;

        horasTotais = horaFim - horaInicio;
        minutosTotais = minutoFim - minutoInicio;

        if (horasTotais <= 0 && minutosTotais <= 0) {
            horasTotais += 24;
        } else if (horasTotais < 0) {
            horasTotais += 24;
        }

        if (minutosTotais < 0) {
            minutosTotais += 60;
            horasTotais -= 1;
        }

        System.out.println("O JOGO DUROU " + horasTotais + " HORA(S) E " + minutosTotais + " MINUTO(S)");

        entrada.close();
    }
}
