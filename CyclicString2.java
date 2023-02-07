package String;

import java.util.Scanner;

public class CyclicString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        int num = scan.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (count == num) {
                    break;
                }
                count++;
                System.out.print(text.charAt(j));
            }
            for (int j = text.length() - 1; j >= 0; j--) {
                if (count == num) {
                    break;
                }
                count++;
                System.out.print(text.charAt(j));
            }
        }

    }
}
