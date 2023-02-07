package String;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int num = scan.nextInt();
        if (num > 0 && num - 1 < text.length()) {
            System.out.println(text.charAt(num - 1));
        } else {
            System.out.println("invalid position");
        }
    }
}
