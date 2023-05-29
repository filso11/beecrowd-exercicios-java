package Iniciante;

import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicio = entrada.nextInt();
        int horaFim = entrada.nextInt();
        int tempoJogo;

        if (horaInicio == horaFim) {
            tempoJogo = 24;
        } else {
            if (horaInicio > horaFim) {
                tempoJogo = (24 - horaInicio) + horaFim;
            } else {
                tempoJogo = horaFim - horaInicio;
            }
        }

        System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");

        entrada.close();
    }
}
