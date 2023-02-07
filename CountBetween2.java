package String;

import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // A65 Z90 , a97 z122
        String text = scan.nextLine();
        int count_A = 0;
        int count_a = 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= (int) 'A' && text.charAt(i) <= (int) 'Z') {
                count_A++;
            } else if (text.charAt(i) >= (int) 'a' && text.charAt(i) <= (int) 'z') {
                count_a++;
            } else {
                count++;
            }
        }
        System.out.println(count_a);
        System.out.println(count_A);
        System.out.println(count);
    }
}
