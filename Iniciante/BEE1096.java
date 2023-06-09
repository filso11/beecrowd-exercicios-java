package Iniciante;

public class BEE1096 {
    public static void main(String[] args) {
        int I = 1;
        int J = 7;

        while (I < 10) {
            while (J > 4) {
                System.out.printf("I=%d J=%d\n", I, J);
                J -= 1;
            }
            J = 7;
            I += 2;
        }
    }
}
