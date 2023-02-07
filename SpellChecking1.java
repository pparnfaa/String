package String;

import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String voc[] = new String[N + 1];
        for (int i = 1; i < N + 1; i++) {
            voc[i] = scan.next();
        }

        int correct = 0;
        for (int i = 1; i < 11; i++) {
            String check = scan.next();
            correct = 0;
            for (int j = 1; j < N + 1; j++) {
                if (voc[j].equals(check) == true) {
                    correct++;
                }
            }
            if (correct > 0) {
                System.out.print("1");
            }
            if (correct == 0) {
                System.out.print("0");
            }
        }
    }
}
