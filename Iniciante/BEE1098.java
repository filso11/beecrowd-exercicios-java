package Iniciante;

public class BEE1098 {
    public static void main(String[] args) {
        double I = 0;
        double J = 1;

        while (I <= 2) {
            double A = J;
            for (int k = 0; k < 3; k++) {
                if (isInt(I)) {
                    System.out.printf("I=%.0f J=%.0f\n", I, A);

                } else {
                    System.out.printf("I=%.1f J=%.1f\n", I, A);

                }
                A++;
            }
            I = Math.round((I + 0.2) * 100) / 100.0;
            J = Math.round((J + 0.2) * 100) / 100.0;
        }
    }

    private static boolean isInt(double value) {
        return value == Math.floor(value);
    }
}
