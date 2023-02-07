package String;

import java.util.Scanner;

public class SpellChecking2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String voc[] = new String[n + 1];
        for (int i = 1; i < n + 1; i++) {
            voc[i] = scan.next();
        }

        int k = scan.nextInt();
        for (int i = 1; i < k + 1; i++) {
            String check = scan.next();
            int correct = 0;
            for (int j = 1; j < n + 1; j++) {
                if (voc[j].indexOf(check) < -1) {
                    System.out.println(voc[j]);
                    break;
                }
            }
        }
    }
}
