package String;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String count_A = "";
        String count_a = "";
        String count = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= (int) 'A' && text.charAt(i) <= (int) 'Z') {
                count_A += text.charAt(i);
            } else if (text.charAt(i) >= (int) 'a' && text.charAt(i) <= (int) 'z') {
                count_a += text.charAt(i);
            } else {
                count += text.charAt(i);
            }
        }
        System.out.println(count_a);
        System.out.println(count_A);
        System.out.println(count);
    }
}
