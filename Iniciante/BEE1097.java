package Iniciante;

public class BEE1097 {
    public static void main(String[] args) {
        int I = 1;
        int J = 7;

        while (I <= 9) {
            int a = J;
            for (int c = 0; c < 3; c++) {
                System.out.printf("I=%d J=%d\n", I, a);
                a -= 1;
            }
            J += 2;
            I += 2;
        }
    }
}
