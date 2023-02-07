package String;

import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < str.length() + 1; i++) {
            if (i == str.length() - 1) {
                System.out.println(str.charAt(i));
                break;
            } else if ((int) str.charAt(i) >= (int) str.charAt(i + 1)) {
                System.out.println((char) str.charAt(i));
            }
        }
    }
}
