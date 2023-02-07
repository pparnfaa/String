package String;

import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        String count = "";
        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 1) {
                count += text.charAt(i);
                System.out.println(count);
                break;
            }
            if ((int) text.charAt(i) >= (int) text.charAt(i + 1)) {
                count += text.charAt(i);
                System.out.println(count);
                count = "";
            } else {
                count += text.charAt(i);
            }
        }
    }
}
