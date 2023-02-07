package String;

import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int pos[] = new int[100];
        for (int i = 0; i < 100; i++) {
            if (str.charAt(i) == str.charAt(0)) {
                pos[i]++;
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(pos[i]);
        }
    }
}
