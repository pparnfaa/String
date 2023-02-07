package String;

import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String words[] = new String[n];
        String answer = "";
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            words[i] = str;
            boolean dup = false;
            for (int j = 0; j < n; j++) {
                if (str.equalsIgnoreCase(words[j]) && i != j) {
                    dup = true;
                    break;
                }
            }
            if (dup == false) {
                System.out.print(words[i] + " ");
            }

        }
    }

}
