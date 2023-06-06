package Iniciante;

import java.util.Scanner;

public class BEE1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x, in = 0, out = 0;

        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out\n", in, out);

        sc.close();
    }
}
