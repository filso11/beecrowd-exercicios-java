package Iniciante;

import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String e1 = entrada.nextLine();
        String e2 = entrada.nextLine();
        String e3 = entrada.nextLine();
        String saida = "";

        String[][] respostas;

        respostas = new String[8][4];

        respostas[0] = new String[] { "vertebrado", "ave", "carnivoro", "aguia" };
        respostas[1] = new String[] { "vertebrado", "ave", "onivoro", "pomba" };
        respostas[2] = new String[] { "vertebrado", "mamifero", "onivoro", "homem" };
        respostas[3] = new String[] { "vertebrado", "mamifero", "herbivoro", "vaca" };
        respostas[4] = new String[] { "invertebrado", "inseto", "hematofago", "pulga" };
        respostas[5] = new String[] { "invertebrado", "inseto", "herbivoro", "lagarta" };
        respostas[6] = new String[] { "invertebrado", "anelideo", "hematofago", "sanguessuga" };
        respostas[7] = new String[] { "invertebrado", "anelideo", "onivoro", "minhoca" };

        for (int i = 0; i < 8; i++) {
            String[] linha = respostas[i];
            if (linha[0].equals(e1) && linha[1].equals(e2) && linha[2].equals(e3)) {
                saida = linha[3];
            }
        }

        System.out.println(saida);

        entrada.close();
    }
}
