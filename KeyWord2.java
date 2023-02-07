package String;

import java.util.Scanner;

public class KeyWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String words[] = new String[n];
        int count[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            words[i] = str;
            boolean dup = false;
            for (int j = 0; j < n; j++) {
                if (dup == true) {
                    break;
                }
                if (str.equalsIgnoreCase(words[j]) && i != j) {
                    dup = true;
                    count[j]++;
                }
                if (count[j] >= max) {
                    max = count[j];
                }
            }
            if (dup == false) {
                System.out.print(words[i] + " ");
            }

        }
        System.out.println("");
        System.out.print(max + 1 + " ");
        for (int i = 0; i < n; i++) {
            if (count[i] == max) {
                System.out.print(words[i] + " ");
            }
        }
    }
}
